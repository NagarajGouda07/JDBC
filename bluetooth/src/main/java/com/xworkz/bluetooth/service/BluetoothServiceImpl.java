package com.xworkz.bluetooth.service;

import com.xworkz.bluetooth.dto.BluetoothDto;
import com.xworkz.bluetooth.repository.BluetoothRepoImpl;

public class BluetoothServiceImpl implements BluetoothService {

	@Override
	public boolean save(BluetoothDto bluetoothDto) {
		boolean isValid = true;

		if (bluetoothDto != null) {
			String name = bluetoothDto.getName();
			if (name != null && !name.isEmpty() && name.length() > 6 && name.length() < 14) {
				System.out.println("Valid Name");
			} else {
				System.err.println("Invalid Name");
				isValid = false;
			}

			String email = bluetoothDto.getEmail();
			if ((email.charAt(0) < 'A' || email.charAt(0) > 'Z') || (email.length() < 8 || email.charAt(7) != '@')
					|| (!email.endsWith("@gmail.com"))) {
				System.out.println("valid Email");
				isValid = false;
			} else {
				System.err.println("InValid Email");
			}

			int age = bluetoothDto.getAge();
			if (age > 5) {
				System.out.println("Age is Valid");
			} else {
				System.err.println("Age is Invalid");
				isValid = false;
			}

			String Number = bluetoothDto.getNumber();
			if (String.valueOf(Number).length() == 10 && String.valueOf(Number).charAt(0) == ('9')) {
				System.err.println("inValid Number");
			} else {
				System.out.println("valid Number");
				isValid = false;
			}

		}

		if (isValid) {
			BluetoothRepoImpl bluetoothRepoImpl = new BluetoothRepoImpl();
			boolean isSaved = bluetoothRepoImpl.save(bluetoothDto);

		}

		return isValid;
	}
}
