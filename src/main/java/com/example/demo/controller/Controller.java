package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Dao;
import com.example.demo.entity.Employee;

@RestController
public class Controller {

	 @Autowired
	 Dao dao;

	 // Get Data -> search ->  Id, Name , Designation
	 @GetMapping("/getData")
	 public List<Employee> queryAll(@RequestBody Employee jsonData) {

			
	   
	    Employee emp = new Employee();
		emp.setEmp_Id(jsonData.getEmp_Id());
		emp.setEmp_Name(jsonData.getEmp_Name());
		emp.setEmp_Designation(jsonData.getEmp_Designation()); 
		emp.setEmp_Dod(jsonData.getEmp_Dod());
		System.out.println(emp.getEmp_Id());
		
        return dao.select(emp);

	}

	 //Insert Data
	 @PostMapping("/insert") 
	 public String insertBoth(@RequestBody Employee jsonData) {
	  
	    System.out.println("Received JSON data:");
	    Employee emp=new Employee(); 
	    emp.setEmp_Id(jsonData.getEmp_Id());
	    emp.setEmp_Name(jsonData.getEmp_Name());
	    emp.setEmp_Designation(jsonData.getEmp_Designation());
	    emp.setEmp_Dod(jsonData.getEmp_Dod()); 
	    System.out.println(emp.getEmp_Id()); 
	    
	    dao.insert_Detail(emp); 
	    dao.insert_Address(emp);
	  
	    return "Data inserted successfully";
	    
	}

	 // Update-> Designation and Address
	 @PostMapping("/update")
	 public String updateBoth(@RequestBody Employee jsonData) {

		Employee emp = new Employee();
		emp.setEmp_Id(jsonData.getEmp_Id());
		emp.setEmp_Designation(jsonData.getEmp_Designation());
		emp.setEmp_Name(jsonData.getEmp_Name());
		dao.update(emp);

		return "Data is updated successfully";

	}

	 // Delete Data -> emp_Id 
	 @DeleteMapping("/delete")
	 public String deleteBoth(@RequestBody Employee jsonData) {

		Employee emp = new Employee();
		emp.setEmp_Id(jsonData.getEmp_Id());
		dao.delete(emp);

		return "Data is deleted";
	}

}
