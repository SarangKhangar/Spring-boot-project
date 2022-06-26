package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zensar.bean.Employee;

@ResponseBody
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	

}
