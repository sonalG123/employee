package com.employeeportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name = "empid", nullable = false)
	private int empId;
	@Column(name = "empname", length = 60, nullable = false)
	private String empName;
	@Column(name = "empage", nullable = false)
	private int empAge;
	@Column(name = "empgender", length = 10, nullable = false)
	private String empGender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, int empAge, String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
}
