package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Exam;
import com.college.service.ExamService;

@RestController
public class ExamController {
	@ResponseBody
	@GetMapping("/getAllExams")
	ArrayList<Exam> getAllExams() {
		ExamService exService = new ExamService();
		return exService.getAllExams();
	}

	@PostMapping("/createExam")
	void createExam(@RequestBody Exam ex) {
		ExamService exService = new ExamService();
		exService.createExam(ex);
	}

	@PutMapping("/updateExam")
	void putExam(@RequestBody Exam ex) {
		ExamService exService = new ExamService();
		exService.updateExam(ex);
	}

	@DeleteMapping("/deleteExam")
	void deleteStudent(@RequestBody String idnumber) {
		ExamService exService = new ExamService();
		exService.deleteExam(idnumber);
	}
}