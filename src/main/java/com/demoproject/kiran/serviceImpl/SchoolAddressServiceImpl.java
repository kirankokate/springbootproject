package com.demoproject.kiran.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.kiran.pojo.SchoolAddress;
import com.demoproject.kiran.repository.SchoolAddressRepository;
import com.demoproject.kiran.requestTO.SchoolAddressResponseTO;
import com.demoproject.kiran.service.SchoolAddressService;

@Service
public class SchoolAddressServiceImpl implements SchoolAddressService {

	@Autowired
	SchoolAddressRepository schoolAddressRepository;
	
	@Override
	public SchoolAddressResponseTO handleGetSingleSchoolAddress(int id) {
		SchoolAddress schoolAddress = schoolAddressRepository.findById(id).get();
		return getTOFromPojo(schoolAddress);
	}

	private SchoolAddressResponseTO getTOFromPojo(SchoolAddress schoolAddress) {
		SchoolAddressResponseTO response = new SchoolAddressResponseTO();
		response.setId(schoolAddress.getId());
		response.setSchoolAddress(schoolAddress.getSchoolAddress());
		return response;
	}

}
