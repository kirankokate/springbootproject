package com.demoproject.kiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.kiran.requestTO.SchoolRequestTO;
import com.demoproject.kiran.responseTO.SchoolResponseTO;
import com.demoproject.kiran.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	@RequestMapping(value = "/school/{id}", method = RequestMethod.GET)
	ResponseEntity<SchoolResponseTO> handleGetSingleSchool(@PathVariable int id) {
		SchoolResponseTO schoolSingle = schoolService.handleGetSingleSchool(id);
		return new ResponseEntity<>(schoolSingle, HttpStatus.OK);
	}

	@RequestMapping(value = "/school", method = RequestMethod.GET)
	public ResponseEntity<List<SchoolResponseTO>> handleAllSchoolGet() {
		List<SchoolResponseTO> schoolSingle = schoolService.handleAllSchoolGet();
		return new ResponseEntity<>(schoolSingle, HttpStatus.OK);
	}

	@RequestMapping(value = "/school", method = RequestMethod.POST)
	public ResponseEntity<SchoolResponseTO> handleSchoolPost(@RequestBody SchoolRequestTO schoolRequestTO) {
		SchoolResponseTO schoolResponseTO = schoolService.handleSchoolPost(schoolRequestTO);
		return new ResponseEntity<>(schoolResponseTO, HttpStatus.CREATED);
	}

}
