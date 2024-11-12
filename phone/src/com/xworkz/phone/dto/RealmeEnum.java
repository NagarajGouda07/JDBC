package com.xworkz.phone.dto;

public enum RealmeEnum {

	URL("jdbc:mysql://localhost:3306/phones"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private RealmeEnum(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
