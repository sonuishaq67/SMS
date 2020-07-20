package com.college.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Branch;
import com.college.service.BranchService;

@RestController
public class BranchController {
	@ResponseBody
	@GetMapping("/getAllBranch")
	ArrayList<Branch> getAllBranch() {
	       BranchService brcService=new BranchService();
	       return brcService.getAllBranch();
	    }
	@PostMapping("/addBranch")
	void addStudent(@RequestBody Branch brc)
	{
		BranchService brcService=new BranchService();
		brcService.addBranch(brc);
	}
	@PutMapping("/updateBranch")
	void putStudent(@RequestBody Branch brc)
	{
		BranchService brcService=new BranchService();
		brcService.updateBranch(brc);
	}
	@DeleteMapping("/deleteBranch")
	void deleteStudent(@RequestBody String courseid)
	{
		BranchService brcService=new BranchService();
		brcService.deleteBranch(courseid);
	}

}
