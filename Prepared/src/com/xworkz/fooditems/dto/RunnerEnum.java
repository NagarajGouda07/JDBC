package com.xworkz.fooditems.dto;

public enum RunnerEnum {
	
	URL("jdbc:mysql://localhost:3306/fooditem"),
	USERNAME("root"), 
	PASSWORD("Nagaraj@007");

	private final String value;

	private RunnerEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
