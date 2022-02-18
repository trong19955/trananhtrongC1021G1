package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action ==null){
            action="";
        }switch (action){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                listProducts(request,response);
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
       RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
       try{
           dispatcher.forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
    String nameProduct = request.getParameter("name");
    double princeProduct = Double.parseDouble(request.getParameter("prince"));
    String descriptionOfTheProduct = request.getParameter("description");
    String producer = request.getParameter("producer");
    int id =(int)(Math.random()*10000);

    Product product = new Product(id,nameProduct,princeProduct,descriptionOfTheProduct,producer);
    this.productService.save(product);
    RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
    request.setAttribute("message","New product was created");
    try{
        dispatcher.forward(request,response);
    } catch (ServletException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
