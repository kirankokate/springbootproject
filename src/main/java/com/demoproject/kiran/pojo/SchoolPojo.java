package com.demoproject.kiran.pojo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@jakarta.persistence.Table(name = "school")
public class SchoolPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "school_address_id", referencedColumnName = "id")
//	private SchoolAddress address;
	
	@OneToMany(targetEntity= SchoolAddress.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="school_id", referencedColumnName="id")
	private List<SchoolAddress> schoolAddress;

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

	public List<SchoolAddress> getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(List<SchoolAddress> schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	

}
