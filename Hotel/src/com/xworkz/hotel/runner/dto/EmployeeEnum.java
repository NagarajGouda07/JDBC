package com.xworkz.hotel.runner.dto;

public enum EmployeeEnum {
	
	URL("jdbc:mysql://localhost:3306/employee"),
    USERNAME("root"),
    PASSWORD("Nagaraj@007");

    private final String value;

    private EmployeeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
