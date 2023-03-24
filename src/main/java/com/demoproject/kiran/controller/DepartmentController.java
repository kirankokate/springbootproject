package com.demoproject.kiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.kiran.pojo.Department;
import com.demoproject.kiran.responseTO.DepartmentResponseTO;
import com.demoproject.kiran.responseTO.EmployeeResponseTO;
import com.demoproject.kiran.responseTO.SchoolResponseTO;
import com.demoproject.kiran.service.SchoolService;

@RestController
public class DepartmentController {

	@Autowired
	SchoolService schoolService;
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	ResponseEntity<DepartmentResponseTO> handleGetSingleDepartment(@PathVariable int id) {
		DepartmentResponseTO response = schoolService.handleGetSingleDepartment(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	ResponseEntity<EmployeeResponseTO> handleGetSingleEmployee(@PathVariable int id) {
		EmployeeResponseTO response = schoolService.handleGetSingleEmployee(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
}
