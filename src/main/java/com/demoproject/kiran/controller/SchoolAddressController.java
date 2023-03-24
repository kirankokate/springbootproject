package com.demoproject.kiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.kiran.requestTO.SchoolAddressResponseTO;
import com.demoproject.kiran.responseTO.SchoolResponseTO;
import com.demoproject.kiran.service.SchoolAddressService;
import com.demoproject.kiran.service.SchoolService;

@RestController
public class SchoolAddressController {
	
	@Autowired
	private SchoolAddressService schoolAddressService;

	@RequestMapping(value = "/school/address/{id}", method = RequestMethod.GET)
	ResponseEntity<SchoolAddressResponseTO> handleGetSingleSchoolAddress(@PathVariable int id) {
		SchoolAddressResponseTO schoolAddressResponseTO = schoolAddressService.handleGetSingleSchoolAddress(id);
		return new ResponseEntity<>(schoolAddressResponseTO, HttpStatus.OK);
	}

}
