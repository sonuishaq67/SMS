package com.college.model;

public class CollegeInfo {
	String Name,Branch,ID_No,Section;
	int roll_no;

	public String getID_No() {
		return ID_No;
	}

	public void setID_No(String iD_No) {
		ID_No = iD_No;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}


}

