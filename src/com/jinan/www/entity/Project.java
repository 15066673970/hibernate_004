package com.jinan.www.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Project implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int proid;
		private String proname;
		private Set<Employee> employees  = new HashSet<Employee>();
		
		
		
		
		@Override
		public String toString() {
			return "Project [proid=" + proid + ", proname=" + proname + ", employees=" + employees + "]";
		}
		public Project(int proid, String proname) {
			super();
			this.proid = proid;
			this.proname = proname;
		
		}
		public Project() {
			super();
		}
		public int getProid() {
			return proid;
		}
		public void setProid(int proid) {
			this.proid = proid;
		}
		public String getProname() {
			return proname;
		}
		public void setProname(String proname) {
			this.proname = proname;
		}
		public Set<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}
		
		
		
		
}
