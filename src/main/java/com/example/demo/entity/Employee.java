package com.example.demo.entity;

import java.util.Date;
public class Employee {
	
	int emp_Id;
	String emp_Name;
	Date emp_Dod;
	String emp_Designation;
	
	EmployeeDetail emp2;
	
	int pincode;
	String emp_Add;
	
	
	
	
	public Date getEmp_Dod() {
		return emp_Dod;
	}
	public void setEmp_Dod(Date emp_Dod) {
		this.emp_Dod = emp_Dod;
	}
	public String getEmp_Designation() {
		return emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}
	public EmployeeDetail getEmp2() {
		return emp2;
	}
	public void setEmp2(EmployeeDetail emp2) {
		this.emp2 = emp2;
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	

}
