package com.college.service;

import java.util.ArrayList;

import com.college.model.CollegeInfo;
import com.college.model.ExamInfo;
import com.college.repo.CollegeInfoRepo;

public class CollegeInfoService {
	public ArrayList<CollegeInfo> getStudentByID(String string) {
		CollegeInfoRepo ciRepo = new CollegeInfoRepo();
		return ciRepo.getStudentByID(string);
	}
	public ArrayList<ExamInfo> getExamByID(String string)
	{		
	CollegeInfoRepo ciRepo = new CollegeInfoRepo();
	return ciRepo.getExamByID(string);
	}

}
