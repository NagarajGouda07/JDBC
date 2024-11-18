package com.xworkz.signup.repository;

import com.xworkz.signup.dto.SignupDto;

public interface SingupRepo {

	boolean save(SignupDto signupDto);

}
