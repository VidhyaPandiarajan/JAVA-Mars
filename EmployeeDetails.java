package com.training.mars;

public class EmployeeDetails {

	private int EmployeeId;
	private String EmployeeName;
	private String Department;
	private int EmpAge;
	
		
	public int getEmployeeId() {
		return this.EmployeeId;
	}
	
	public void setEmployeeId(int id) {
		this.EmployeeId = id;
	}
   
	public String getEmployeeName() {
		return this.EmployeeName;
	}
	
	public void setEmployeeName(String name) {
		this.EmployeeName = name;
	}
	
	public String getDepartment() {
		return this.Department;
	}
	
	public void setDepartment(String department) {
		this.Department = department;
	}
	
	public int getEmpAge() {
		return this.EmpAge;
	}
	
	public void setEmpAge(int age) {
		this.EmpAge = age;
	}
	
	public String getEmployeeInfo() {
		return ("\n"+ EmployeeId + ":" +"\n"+ EmployeeName + "\n"+ Department +"\n"+ EmpAge);
	}
}
