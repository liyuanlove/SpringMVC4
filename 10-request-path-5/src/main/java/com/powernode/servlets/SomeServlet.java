package com.powernode.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("====================");
        //转发：路径有/
//        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        //重定向：路径无/
        response.sendRedirect("welcome.jsp");
    }

}
