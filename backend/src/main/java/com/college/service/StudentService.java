package com.college.service;

import java.util.ArrayList;
import com.college.model.Student;
import com.college.repo.StudentRepo;



public class StudentService {
	public  ArrayList<Student> getAllStudents() {
		StudentRepo stdRepo = new StudentRepo();
		return stdRepo.getAllStudents();
	}
	public void addStudent(Student std)
	{
		StudentRepo stdRepo =new StudentRepo();
		stdRepo.insertStudent(std);
	}
	public void updateStudent(Student std)
	{
		StudentRepo stdRepo =new StudentRepo();
		stdRepo.updateStudent(std);
	}
	public void deleteStudent(String idNumber)
	{
		StudentRepo stdRepo=new StudentRepo();
		stdRepo.deleteStudent(idNumber);
	}

}
