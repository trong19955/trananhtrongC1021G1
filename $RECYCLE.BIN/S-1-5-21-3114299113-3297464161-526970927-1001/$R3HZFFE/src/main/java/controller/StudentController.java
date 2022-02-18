package controller;

import model.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentController", urlPatterns = "/student")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<student> studentList = new ArrayList<>();

        studentList.add(new student(1, "HaiTT", "1998/01/01", "hai.truong@codegym.vn", 9));
        studentList.add(new student(2, "TrungDP", "1998/01/01", "hai.truong@codegym.vn", 11));
        studentList.add(new student(3, "TrungDC", "1998/01/01", "hai.truong@codegym.vn", 7));
        studentList.add(new student(4, "TienNVT", "1998/01/01", "hai.truong@codegym.vn", 10));
    //gửi dữ liệu sang JSP
        request.setAttribute("list", studentList);
        request.getRequestDispatcher("/student/student_list.jsp").forward(request,response);

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}


