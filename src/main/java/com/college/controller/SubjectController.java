package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Subject;
import com.college.service.SubjectService;
@RestController
public class SubjectController {
	@ResponseBody
    @GetMapping("/getAllSubjects")
    ArrayList<Subject> getAllSubjects() {
       SubjectService subService=new  SubjectService();
       return subService.getAllSubjects();
    }
	@PostMapping("/addSubject")
	void addSubject(@RequestBody Subject sub)
	{
		SubjectService subService=new SubjectService();
		subService.addSubject(sub);
	}
	@PutMapping("/updateSubject")
	void putSubject(@RequestBody Subject sub)
	{
	SubjectService subService =new SubjectService();
	subService.updateSubject(sub);
	}
	@DeleteMapping("/deleteSubject")
	void deleteSubject(@RequestBody String idnumber)
	{
	SubjectService subService =new SubjectService();
	subService.deleteSubject(idnumber);
	}

}
