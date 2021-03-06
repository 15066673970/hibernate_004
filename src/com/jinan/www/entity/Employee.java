package com.jinan.www.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empid;
	private String empname;
	
	private Set<Project> projects = new HashSet<Project>();

	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", projects=" + projects + "]";
	}

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	
	}

	public Employee() {
		super();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	

}
