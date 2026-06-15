package com.rms.servlet;

import java.io.IOException;

import com.rms.dao.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAO();

        boolean status = dao.validateUser(email, password);

        if(status) {

            request.getSession().setAttribute("email", email);

            String role = dao.getUserRole(email);

            if("ADMIN".equals(role)) {

                response.sendRedirect("adminDashboard.jsp");

            } else {

                response.sendRedirect("dashboard.jsp");

            }

        } else {

            response.getWriter().println("Invalid Email or Password");
        }
    }
}