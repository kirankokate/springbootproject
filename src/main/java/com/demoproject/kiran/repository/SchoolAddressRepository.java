package com.demoproject.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoproject.kiran.pojo.SchoolAddress;

@Repository
public interface SchoolAddressRepository extends JpaRepository<SchoolAddress, Integer>{

}
