package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Student;
import com.college.service.StudentService;

@RestController
public class StudentController {
	@ResponseBody
    @GetMapping("/getAllStudents")
    ArrayList<Student> getAllStudents() {
       StudentService stdService=new  StudentService();
       return stdService.getAllStudents();
    }
	@PostMapping("/addStudent")
	void addStudent(@RequestBody Student stu)
	{
		StudentService stdService=new StudentService();
		stdService.addStudent(stu);
	}
	@PutMapping("/updateStudent")
	void putStudent(@RequestBody Student stu)
	{
	StudentService stdService =new StudentService();
	stdService.updateStudent(stu);
	}
	@DeleteMapping("/deleteStudent")
	void deleteStudent(@RequestBody String idnumber)
	{
	StudentService stdService =new StudentService();
	stdService.deleteStudent(idnumber);
	}
}
