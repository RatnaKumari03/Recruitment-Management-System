package com.rms.servlet;

import java.io.IOException;

import com.rms.dao.UserDAO;
import com.rms.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole("CANDIDATE");

        UserDAO dao = new UserDAO();

        boolean status = dao.registerUser(user);

        if(status) {
            response.getWriter().println("Registration Successful");
        } else {
            response.getWriter().println("Registration Failed");
        }
    }
}