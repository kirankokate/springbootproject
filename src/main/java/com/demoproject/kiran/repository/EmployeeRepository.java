package com.demoproject.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demoproject.kiran.pojo.Department;
import com.demoproject.kiran.pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
