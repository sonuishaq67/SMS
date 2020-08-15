package com.college.service;

import java.util.ArrayList;

import com.college.model.Subject;
import com.college.repo.SubjectRepo;

public class SubjectService {
	public  ArrayList<Subject> getAllSubjects() {
		SubjectRepo subRepo = new SubjectRepo();
		return subRepo.getAllSubjects();
	}
	public void addSubject(Subject sub)
	{
		SubjectRepo subRepo = new SubjectRepo();
		subRepo.insertSubject(sub);
	}
	public void updateSubject(Subject sub)
	{
		SubjectRepo subRepo = new SubjectRepo();
		subRepo.updateSubject(sub);
	}
	public void deleteSubject(String subid)
	{
		SubjectRepo subRepo = new SubjectRepo();
		subRepo.deleteSubject(subid);
	}

}
