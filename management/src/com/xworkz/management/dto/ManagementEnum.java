package com.xworkz.management.dto;

public enum ManagementEnum {

	URL("jdbc:mysql://localhost:3306/car"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private ManagementEnum(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
