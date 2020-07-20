package com.college.service;

import java.util.ArrayList;
import com.college.model.Branch;
import com.college.model.BranchSubjects;
import com.college.repo.BranchRepo;
import com.college.repo.BranchSubjectsRepo;

public class BranchService {
	public ArrayList<Branch> getAllBranch() {
		BranchRepo brcRepo = new BranchRepo();
		return brcRepo.getAllBranch();
	}

	public void addBranch(Branch brc) {
		BranchRepo brcRepo = new BranchRepo();
		brcRepo.insertBranch(brc);
		BranchSubjectsRepo brcSubRepo = new BranchSubjectsRepo();

		for (String subject : brc.getSubjects()) {

			BranchSubjects newbrc = new BranchSubjects();
			newbrc.setSubjectsID(subject);
			newbrc.setBranchID(brc.getCourseId());
			brcSubRepo.insertBranchSubjects(newbrc);

		}

	}

	public void updateBranch(Branch brc) {
		BranchRepo brcRepo = new BranchRepo();
		brcRepo.updateBranch(brc);
	}

	public void deleteBranch(String courseId) {
		BranchRepo brcRepo = new BranchRepo();
		brcRepo.deleteBranch(courseId);
	}

}
