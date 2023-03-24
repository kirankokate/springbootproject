package com.demoproject.kiran.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.json.JSONFilter;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.kiran.pojo.Department;
import com.demoproject.kiran.pojo.Employee;
import com.demoproject.kiran.pojo.SchoolAddress;
import com.demoproject.kiran.pojo.SchoolPojo;
import com.demoproject.kiran.repository.DepartmentRepository;
import com.demoproject.kiran.repository.EmployeeRepository;
import com.demoproject.kiran.repository.SchoolRepository;
import com.demoproject.kiran.requestTO.SchoolAddressRequestTO;
import com.demoproject.kiran.requestTO.SchoolRequestTO;
import com.demoproject.kiran.responseTO.DepartmentResponseTO;
import com.demoproject.kiran.responseTO.EmployeeResponseTO;
import com.demoproject.kiran.responseTO.SchoolResponseTO;
import com.demoproject.kiran.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public SchoolResponseTO handleGetSingleSchool(int id) {
		SchoolPojo ll = schoolRepository.findById(id).get();
		return getTOFromPojo(ll);
	}

	@Override
	public List<SchoolResponseTO> handleAllSchoolGet() {
		List<SchoolPojo> findAll = schoolRepository.findAll();
		List<Department> findAll2 = departmentRepository.findAll();
		System.out.println(findAll2.size());
		for (Department department : findAll2) {
			List<Employee> employees = department.getEmployees();
			System.out.println(department.getDeptid() + " "+ department.getDname() + " NumberOfEmployee: " + department.getEmployees().size());
			for (Employee emp : employees) {
				System.out.println(emp.getEname());
			}
		}
		System.out.println("Employee data is below---------------");
		List<Employee> all = employeeRepository.findAll();
		for (Employee employee : all) {
			System.out.println(employee.getEmpid() +" "+employee.getEname() +" "+employee.getDepartment().getDname());
		}
		
		
		return convertPOJOTOResponseTO(findAll);
	}

	@Override
	public SchoolResponseTO handleSchoolPost(SchoolRequestTO schoolRequestTO) {
//		SchoolPojo schoolPojo = convertRequestTOPojo(schoolRequestTO);
//		schoolPojo = schoolRepository.save(schoolPojo);
		
		Department d = new Department();
		d.setDeptid(4);
		d.setDname("Mechanical");
		List<Employee> ll = new ArrayList<>();
		Employee e = new Employee();
		e.setEmpid(6);
		e.setEmail("niket@gmail.com");
		e.setEname("niket");
		e.setDepartment(d);
		ll.add(e);
		d.setEmployees(ll);
		Department save = departmentRepository.save(d);
		System.out.println("saving department and --------------------");
		System.out.println(save.getDname()+" "+ save.getDeptid() +" "+save.getEmployees().get(0).getEname());
		
//		return getTOFromPojo(schoolRepository.findById(schoolPojo.getId()).get());
		return null;
	}
	
	@Override
	public DepartmentResponseTO handleGetSingleDepartment(int id) {
		
		Department department = departmentRepository.findById(id).get();
		DepartmentResponseTO d = new DepartmentResponseTO();
		d.setDeptid(department.getDeptid());
		d.setDname(department.getDname());
		d.setEmployees(department.getEmployees());
		return d;
	}
	
	@Override
	public EmployeeResponseTO handleGetSingleEmployee(int id) {
		
		Employee pojo = employeeRepository.findById(id).get();
		EmployeeResponseTO d = new EmployeeResponseTO();
		d.setEmpid(pojo.getEmpid());
		d.setEmail(pojo.getEmail());
		d.setEname(pojo.getEname());
		d.setDepartment(pojo.getDepartment());
		
		return d;
	}

	private SchoolResponseTO getTOFromPojo(SchoolPojo pojo) {
		SchoolResponseTO response = new SchoolResponseTO();
		response.setId(pojo.getId());
		response.setName(pojo.getName());

		List<SchoolAddress> lSchoolAddress = pojo.getSchoolAddress();
		List<SchoolAddressRequestTO> lSchoolAddressRequestTO = new ArrayList<>();
		for (SchoolAddress schoolAddress : lSchoolAddress) {
			SchoolAddressRequestTO schoolAddressRequestTO = new SchoolAddressRequestTO();
			schoolAddressRequestTO.setId(schoolAddress.getId());
			schoolAddressRequestTO.setSchoolAddress(schoolAddress.getSchoolAddress());
			lSchoolAddressRequestTO.add(schoolAddressRequestTO);
		}
		response.setSchoolAddress(lSchoolAddressRequestTO);
		return response;
	}

	private List<SchoolResponseTO> convertPOJOTOResponseTO(List<SchoolPojo> ll) {
		List<SchoolResponseTO> response = new ArrayList<>();
		for (SchoolPojo pojo : ll) {
			response.add(getTOFromPojo(pojo));
		}
		return response;
	}

	private SchoolPojo convertRequestTOPojo(SchoolRequestTO schoolRequestTO) {
		SchoolPojo schoolPojo = new SchoolPojo();
		schoolPojo.setName(schoolRequestTO.getName());
		List<SchoolAddress> sAddresspojo = new ArrayList<SchoolAddress>();

		List<SchoolAddressRequestTO> list = schoolRequestTO.getSchoolAddress();
		for (SchoolAddressRequestTO schoolAddressRequestTO : list) {
			SchoolAddress s = new SchoolAddress();
			s.setSchoolAddress(schoolAddressRequestTO.getSchoolAddress());
			sAddresspojo.add(s);
		}
		schoolPojo.setSchoolAddress(sAddresspojo);
		return schoolPojo;
	}

	

	

}
