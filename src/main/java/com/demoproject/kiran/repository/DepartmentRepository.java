package com.demoproject.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demoproject.kiran.pojo.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
