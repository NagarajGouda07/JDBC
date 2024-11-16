package com.xworkz.car.dto;

public enum CarEnum {

	URL("jdbc:mysql://localhost:3306/carmodel"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private CarEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
