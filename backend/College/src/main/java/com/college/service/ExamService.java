package com.college.service;

import java.util.ArrayList;
import com.college.model.Exam;
import com.college.repo.ExamRepo;



	public class ExamService {
		public  ArrayList<Exam> getAllExams() {
			ExamRepo exRepo = new ExamRepo();
			return exRepo.getAllExams();
		}
		public void createExam(Exam ex)
		{
			ExamRepo exRepo = new ExamRepo();
			exRepo.createExam(ex);
		}
		public void updateExam(Exam ex)
		{
			ExamRepo exRepo = new ExamRepo();
			exRepo.updateExam(ex);
		}
		public void deleteExam(String idNumber)
		{
			ExamRepo exRepo = new ExamRepo();
			exRepo.deleteExam(idNumber);
		}

	
}