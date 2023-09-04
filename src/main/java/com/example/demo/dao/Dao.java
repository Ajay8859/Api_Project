package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface Dao {

	
	List<Employee> select(Employee employee);
	void update(Employee employee );
	
	void insert_Detail(Employee employee );
	void insert_Address(Employee employee );
	
	void delete(Employee employee);
	
}
