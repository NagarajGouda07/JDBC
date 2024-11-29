package com.xworkz.user.servlet;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;
import com.xworkz.user.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("/UserServlet");
        if ("register".equals(action)) {
            handleRegister(request, response);
        }
        // Add more actions like getById, update, delete as needed
    }

    private void handleRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserDTO user = new UserDTO();
        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setPhone(request.getParameter("phone"));
        user.setAddress(request.getParameter("address"));
        user.setMessage(request.getParameter("message"));

        boolean result = userService.addUser(user);
        response.getWriter().write(result ? "User Registered Successfully!" : "Error Registering User!");
    }
}
