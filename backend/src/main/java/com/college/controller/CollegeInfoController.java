package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import com.college.model.CollegeInfo;
import com.college.model.ExamInfo;
import com.college.service.CollegeInfoService;


@RestController
public class CollegeInfoController {
@ResponseBody
@GetMapping("/getstudentbyid")
ArrayList<CollegeInfo> getStudentByID(@RequestBody String Roll_No)
{
	CollegeInfoService ciService=new CollegeInfoService();
	return ciService.getStudentByID(Roll_No);		
}

@GetMapping("/getExamsbyID")
ArrayList<ExamInfo> getExamByID(@RequestBody String Roll_No)
{
	CollegeInfoService ciService=new CollegeInfoService();

	return ciService.getExamByID(Roll_No);
}
}
