package com.demoproject.kiran.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demoproject.kiran.pojo.Department;
import com.demoproject.kiran.requestTO.SchoolRequestTO;
import com.demoproject.kiran.responseTO.DepartmentResponseTO;
import com.demoproject.kiran.responseTO.EmployeeResponseTO;
import com.demoproject.kiran.responseTO.SchoolResponseTO;

@Service
public interface SchoolService {

	SchoolResponseTO handleSchoolPost(SchoolRequestTO schoolRequestTO);

	List<SchoolResponseTO> handleAllSchoolGet();

	SchoolResponseTO handleGetSingleSchool(int id);

	DepartmentResponseTO handleGetSingleDepartment(int id);

	EmployeeResponseTO handleGetSingleEmployee(int id);

}
