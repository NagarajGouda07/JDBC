package com.xworkz.orderform.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.orderform.Service.OrderServiceImpl;
import com.xworkz.orderform.dto.OrderDto;

@WebServlet(urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String city = req.getParameter("city");

		String pincode = req.getParameter("pincode");
		int convertedPincode = Integer.valueOf(pincode);

		OrderDto orderDto = new OrderDto(name, email, phone, address, city, convertedPincode);

		OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
		orderServiceImpl.valideDate(orderDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);

		System.out.println("Name:" + name);
		System.out.println("Email" + email);
		System.out.println("Phone:" + phone);
		System.out.println("Address:" + address);
		System.out.println("City:" + city);
		System.out.println("Pincode:" + pincode);

	}

}
