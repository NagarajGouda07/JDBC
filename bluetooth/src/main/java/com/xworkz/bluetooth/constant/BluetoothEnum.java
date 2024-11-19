package com.xworkz.bluetooth.constant;

public enum BluetoothEnum {

	URL("jdbc:mysql://localhost:3306/kill"), USERNAME("root"), PASSWORD("Nagaraj@007");

	private final String value;

	private BluetoothEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
