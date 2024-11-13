package com.xworkz.fooditems.dto;

public enum LaptopEnum {

	URL("jdbc:mysql://localhost:3306/laptops"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private LaptopEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
