package controller;

import model.Product;
import sevice.ProductService;
import sevice.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
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

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {

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
        List<Product> products =this.productService.findAll();
        request.setAttribute("products",products);

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
        String action =request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
    }


    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name =request.getParameter("name");
        String prince = request.getParameter("price");
        String description = request.getParameter("description");
        String produce = request.getParameter("produce");
        int id = (int)(Math.random()*10000);

        Product product = new Product(id, name, prince,description,produce);
        this.productService.save(product);
        RequestDispatcher dispatcher =request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message", "new product was created");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
