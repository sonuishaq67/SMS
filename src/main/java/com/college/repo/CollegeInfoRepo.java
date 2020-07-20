package com.college.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.college.model.CollegeInfo;
import com.college.model.ExamInfo;
import com.college.utility.DatabaseConnectionUtility;


public class CollegeInfoRepo {

	public ArrayList<CollegeInfo> getStudentByID(String string) {
		ArrayList<CollegeInfo> list = new ArrayList<CollegeInfo>();
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "select Name,branchName,SubjectName from Student\n"
					+ "inner join Branch on Student.BranchID=Branch.branch_Id\n"
					+ "inner join BranchSubjects on Student.BranchID=BranchSubjects.BranchId\n"
					+ "inner join Subjects on Subjects.SubjectId=BranchSubjects.SubjectsID\n" + "where ID_NO='" + string
					+ "';";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				CollegeInfo ci = new CollegeInfo();
				ci.setBranch(rs.getString("branchName"));
				ci.setSubjectName(rs.getString("SubjectName"));
				ci.setName(rs.getString("Name"));
				list.add(ci);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<ExamInfo> getExamByID(String string) {
		ArrayList<ExamInfo> list = new ArrayList<ExamInfo>();
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "select SubjectName,Type,Date from Student\n"
					+ "inner join Exams on Student.BranchID=Exams.Branch_ID\n"
					+ "inner join Subjects on Subjects.SubjectId=Exams.SubjectId\n" + "where ID_NO='" + string + "';\n";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ExamInfo ei = new ExamInfo();
				ei.setExamName(rs.getString("Type"));
				ei.setSubjectName(rs.getString("SubjectName"));
				ei.setExamDate(rs.getString("Date"));
				list.add(ei);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
