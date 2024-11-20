package com.xworkz.orderform.constant;

public enum OrderEnum {

	URL("jdbc:mysql://localhost:3306/ram"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private OrderEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
