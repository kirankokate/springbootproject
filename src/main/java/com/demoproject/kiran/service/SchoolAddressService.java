package com.demoproject.kiran.service;

import org.springframework.stereotype.Service;

import com.demoproject.kiran.requestTO.SchoolAddressResponseTO;

@Service
public interface SchoolAddressService {

	SchoolAddressResponseTO handleGetSingleSchoolAddress(int id);

}
