package com.xworkz.register.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		System.out.println("no-arg const of RegisterServlet...");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String phone_no = request.getParameter("phone_no");

		System.out.println("after req parameters ");

		RegisterService registerService = new RegisterServiceImpl();
		boolean valid = registerService.validateAndSave(new RegisterDTO(name, email, address, age, phone_no));

		request.setAttribute("fun", "Let me check,if its working......");
		request.setAttribute("no", 100);
		request.setAttribute("dto", new RegisterDTO(name, email, address, age, phone_no));


		if (valid) {
			System.out.println("register is valid");
			request.setAttribute("success", "Register is Success");
		} else {
			System.out.println("register is invalid");
			request.setAttribute("failure", "Register is failure");
			request.setAttribute("dto", new RegisterDTO(name, email, address, age, phone_no));

		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Register.jsp");
		requestDispatcher.forward(request, response);

	}

}
