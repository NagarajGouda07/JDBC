package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean validateAndSave(RegisterDTO dto) {

		System.out.println("running validateAndSave");
		boolean checkValid = true;
		if (dto != null) {
			String name = dto.getName();
			if (name != null && !name.isEmpty() && (name.length() > 3 && name.length() < 30)) {
				System.out.println("Valid Name ");
			} else {
				System.err.println("Invalid Name");
				checkValid = false;
			}
		}

		if (dto != null) {
			String email = dto.getEmail();
			if (email != null && !email.isEmpty() && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Valid Email ");
			} else {
				System.err.println("Invalid Email");
				checkValid = false;
			}
		}
		
		if (dto != null) {
			String address = dto.getAddress();
			if (address != null && !address.isEmpty() && (address.length() > 3 && address.length() < 30)) {
				System.out.println("Valid Address ");
			} else {
				System.err.println("Invalid Address");
				checkValid = false;
			}
		}
		
		if (dto != null) {
			String age = dto.getAge();
			if (age != null && !age.isEmpty() && (age.length() > 18 && age.length() <= 90)) {
				System.out.println("Valid Age ");
			} else {
				System.err.println("Invalid Age");
				checkValid = false;
			}
		}
		
		if (dto != null) {
			String phone_no = dto.getPhone_no();
			if (phone_no != null && !phone_no.isEmpty() &&  phone_no.length() == 10) {
				System.out.println("Valid Phone_no ");
			} else {
				System.err.println("Invalid Phone_no");
				checkValid = false;
			}
		}

		return checkValid;
	}

}
