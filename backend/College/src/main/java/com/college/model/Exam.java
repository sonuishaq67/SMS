package com.college.model;

public class Exam {

	String Type;
	String date;
	String ID_No;
	String SubjectId;
	public String getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(String subjectId) {
		SubjectId = subjectId;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String string) {
		this.date = string;
	}

	public String getID_No() {
		return ID_No;
	}

	public void setID_No(String iD_No) {
		ID_No = iD_No;
	}

}
