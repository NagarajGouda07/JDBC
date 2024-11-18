package com.xworkz.signup.constant;

public enum SignupEnum {

	URL("jdbc:mysql://localhost:3306/signup"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private SignupEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
