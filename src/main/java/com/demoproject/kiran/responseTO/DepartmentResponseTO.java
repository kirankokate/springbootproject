package com.demoproject.kiran.responseTO;

import java.util.List;

import com.demoproject.kiran.pojo.Employee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class DepartmentResponseTO {
	private Integer deptid;

	private String dname;

	private List<Employee> employees;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

}
