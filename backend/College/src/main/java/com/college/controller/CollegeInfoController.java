package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import com.college.model.CollegeInfo;
import com.college.model.ExamInfo;
import com.college.service.CollegeInfoService;


@RestController
public class CollegeInfoController {
@ResponseBody
@RequestMapping(path="/getstudentbyid/{id}")
ArrayList<CollegeInfo> getStudentByID(@PathVariable("id") String Roll_No)
{
	CollegeInfoService ciService=new CollegeInfoService();
	return ciService.getStudentByID(Roll_No);		
}

@RequestMapping(path="/getExamsbyID/{id}")
ArrayList<ExamInfo> getExamByID(@PathVariable("id") String Roll_No)
{
	CollegeInfoService ciService=new CollegeInfoService();

	return ciService.getExamByID(Roll_No);
}
}

