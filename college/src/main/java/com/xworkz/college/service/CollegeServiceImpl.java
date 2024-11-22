package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.repo.CollegeImpl;

public class CollegeServiceImpl implements CollegeService {

	@Override
	public boolean validate(CollegeDTO collegeDTO) {

		boolean valid = true;
		if (collegeDTO != null) {
			System.out.println("instituteDTO is not null");
			String firstName = collegeDTO.getName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(collegeDTO.getNumber());
			if (phoneNo != null && phoneNo.length() == 10) {
				System.out.println("PhoneNo is valid");
			} else {
				valid = false;
				System.err.println("PhoneNo is Not valid");
			}
//			String password=collegeDTO.getPassword();
//			if(password!=null && password.length()>4) {
//				System.out.println("password is valid");
//			}
//			 else {
//					valid = false;
//					System.err.println("password is Not valid");
//				}

			int age = collegeDTO.getAge();
			if (age > 18) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = collegeDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith("com") | email.endsWith("in"))) {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				CollegeImpl collegeImpl = new CollegeImpl();
				collegeImpl.save(collegeDTO);
			}

		}
		return valid;
	}

	public String getNameByPhone(String phone) {

		CollegeImpl imp = new CollegeImpl();
		String name = imp.getNameByPhone(phone);
		return name;

	}

	public int deleteDataById(int id) {

		CollegeImpl imp = new CollegeImpl();
		int value = imp.deleteDataById(id);
		return value;
	}

	public String updateByEmail(String email) {

		CollegeImpl imp = new CollegeImpl();
		String value = imp.updateByEmail(email);
		return value;
	}

	public String getListById(int id) {

		CollegeImpl imp = new CollegeImpl();
		String list = imp.getListById(id);
		return list;
	}

}
