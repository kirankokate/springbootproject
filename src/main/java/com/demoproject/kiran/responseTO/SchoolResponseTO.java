package com.demoproject.kiran.responseTO;

import java.util.List;

import com.demoproject.kiran.pojo.SchoolAddress;
import com.demoproject.kiran.requestTO.SchoolAddressRequestTO;

public class SchoolResponseTO {
	
	private int id;
	
	private String name;
	
	private List<SchoolAddressRequestTO> schoolAddress;

	public List<SchoolAddressRequestTO> getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(List<SchoolAddressRequestTO> schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
