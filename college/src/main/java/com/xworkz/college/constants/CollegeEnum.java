package com.xworkz.college.constants;

public enum CollegeEnum {

	URL("jdbc:mysql://localhost:3306/college_table"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private CollegeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
