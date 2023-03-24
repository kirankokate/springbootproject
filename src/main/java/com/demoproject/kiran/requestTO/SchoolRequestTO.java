package com.demoproject.kiran.requestTO;

import java.util.List;
import java.util.Set;

import com.demoproject.kiran.pojo.SchoolAddress;

public class SchoolRequestTO {
	
	private String name;
	
	private List<SchoolAddressRequestTO> schoolAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SchoolAddressRequestTO> getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(List<SchoolAddressRequestTO> schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	
	
	
	
	
	
}
