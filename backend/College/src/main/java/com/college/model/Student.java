package com.college.model;

public class Student {

	private String name;
	private String branch;
	private String iDNO;
	private String section;	
	private int rollno;
	public String getiDNO() {
		return iDNO;
	}
	public void setiDNO(String iDNO) {
		this.iDNO = iDNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	
}
