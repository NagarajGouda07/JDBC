package com.xworkz.signup.service;

import com.xworkz.signup.dto.SignupDto;
import com.xworkz.signup.repository.SignupRepoImpl;

public class SignupServiceImpl implements SignupService {

	@Override
	public boolean save(SignupDto dto) {

		boolean isValid = true;
		System.out.println(dto.getName());
		System.out.println(dto.getLname());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());

		if (isValid) {
			SignupRepoImpl imp = new SignupRepoImpl();
			boolean b = imp.save(dto);

		}

		return false;
	}

}
