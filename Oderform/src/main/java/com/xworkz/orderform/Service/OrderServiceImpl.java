package com.xworkz.orderform.Service;

import com.xworkz.orderform.dto.OrderDto;
import com.xworkz.orderform.repository.OrderRepoImpl;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean valideDate(OrderDto orderDto) {
		System.out.println("Running valideDate in OrderServiceImpl ");

		OrderRepoImpl orderRepoImpl = new OrderRepoImpl();
		boolean saved = orderRepoImpl.Save(orderDto);
		System.out.println("saved in registerServiceImpl:" + saved);

		String name = orderDto.getName();
		if (name != null && !name.isEmpty() && name.length() > 6 && name.length() < 14) {
			System.out.println("firstName is valide");
			saved = true;
		} else {
			System.err.println("firstName is in-valide");
			saved = false;
		}

		String email = orderDto.getEmail();
		if (email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@') == 8)) {
			System.out.println("email is valide");
			saved = true;

		} else {
			System.err.println("email is in-valide");
			saved = false;
		}

		String phone = orderDto.getPhone();
		if (phone != null && phone.length() == 10 && phone.startsWith("9")) {
			System.out.println("Phone number is valid");
		} else {
			System.err.println("Phone number is invalid");
			saved = false;
		}

		int pincode = orderDto.getPincode();
		if (pincode > 4) {
			System.out.println("pincode is valid");
			saved = true;
		} else {
			System.err.println("pincode is invalid");
			saved = false;
		}
		return saved;

	}

}
