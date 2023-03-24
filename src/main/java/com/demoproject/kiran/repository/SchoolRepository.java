package com.demoproject.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demoproject.kiran.pojo.SchoolPojo;

@Repository
public interface SchoolRepository  extends JpaRepository<SchoolPojo, Integer>{

}
