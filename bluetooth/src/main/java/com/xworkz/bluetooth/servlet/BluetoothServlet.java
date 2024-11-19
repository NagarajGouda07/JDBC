package com.xworkz.bluetooth.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bluetooth.dto.BluetoothDto;
import com.xworkz.bluetooth.service.BluetoothService;
import com.xworkz.bluetooth.service.BluetoothServiceImpl;

@WebServlet(urlPatterns = "/fill")
public class BluetoothServlet extends HttpServlet {
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));
      
        String number = req.getParameter("number");

        BluetoothDto dto = new BluetoothDto(name, email, age, number);

        BluetoothService service = new BluetoothServiceImpl();
        boolean result = service.save(dto);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (result) {
            out.println("Form Submitted Successfully");
        } else {
            out.println("Form Submission Failed");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
		dispatcher.forward(req, resp);

    }

}
