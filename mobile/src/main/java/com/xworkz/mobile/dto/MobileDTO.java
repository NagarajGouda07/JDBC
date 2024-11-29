package com.xworkz.mobile.dto;

public class MobileDTO {

	private String name;
	private String email;
	private int age;
	private String phone;
	private String password;
	private String address;

	public MobileDTO(String name, String email, int age, String phone, String password, String address) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
