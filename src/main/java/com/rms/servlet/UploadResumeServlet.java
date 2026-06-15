package com.rms.servlet;

import com.rms.dao.UserDAO;
import jakarta.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/UploadResumeServlet")
@MultipartConfig
public class UploadResumeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        Part filePart = request.getPart("resume");

        String fileName = filePart.getSubmittedFileName();

        String uploadPath = "C:\\ResumeUploads";

        File uploadDir = new File(uploadPath);

        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        filePart.write(uploadPath + File.separator + fileName);
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("email");

        UserDAO dao = new UserDAO();

        dao.updateResume(email, fileName);

        response.sendRedirect("profile.jsp");
    }
}