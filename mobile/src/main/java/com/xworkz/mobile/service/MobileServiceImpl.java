package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.repository.MobileRepositoryImpl;

public class MobileServiceImpl implements MobileService {

	@Override
	public boolean save(MobileDTO bobileDTO) {

		System.out.println("This is servicce method");

		MobileRepositoryImpl mobileRepositoryImpl = new MobileRepositoryImpl();

		return mobileRepositoryImpl.save(bobileDTO);
	}

}