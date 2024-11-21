package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.service.MobileServiceImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class MobileServlet extends HttpServlet{
	
	public MobileServlet() {
		System.out.println("This is servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String age = req.getParameter("age");
		
		int age1 = Integer.valueOf(age);
		
		MobileDTO mobileDTO = new MobileDTO(name, email, age1, phone);
		
		MobileServiceImpl mobileServiceImpl = new MobileServiceImpl();
		
		boolean isvalid = mobileServiceImpl.save(mobileDTO);
		
		if(isvalid) {
			System.out.println("Data from servlet");
		}else {
			System.out.println("Data not from servlet");
		}
		
		RequestDispatcher reqDesp = req.getRequestDispatcher("getData.jsp");
		reqDesp.forward(req, resp);
		
	}
	
}
