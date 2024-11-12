package com.xworkz.kingdom.dto;

public enum VijayanagaraEmpireEnum {

	URL("jdbc:mysql://localhost:3306/kingdom"),
	USERNAME("root"), 
	PASSWORD("Nagaraj@007");

	private final String value;

	private VijayanagaraEmpireEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
