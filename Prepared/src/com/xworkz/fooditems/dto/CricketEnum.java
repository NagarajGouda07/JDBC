package com.xworkz.fooditems.dto;

public enum CricketEnum {

	URL("jdbc:mysql://localhost:3306/cricket"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private CricketEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
