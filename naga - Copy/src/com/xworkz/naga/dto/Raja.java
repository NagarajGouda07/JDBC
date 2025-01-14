package com.xworkz.naga.dto;

public enum Raja {
	
	URL("jdbc:mysql://localhost:3306/employees"),
    USERNAME("root"),
    PASSWORD("Nagaraj@007");

    private final String value;

    private Raja(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
