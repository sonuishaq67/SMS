package com.college.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.college.model.Branch;
import com.college.model.BranchSubjects;
import com.college.utility.DatabaseConnectionUtility;

public class BranchSubjectsRepo {
	public ArrayList<BranchSubjects> getAllBranchSubjects() {
		ArrayList<BranchSubjects> list = new ArrayList<BranchSubjects>();
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt=null;
		try {
			stmt = conn.createStatement();

			String sql = "Select * from BranchSubjects";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BranchSubjects brS = new BranchSubjects();
				brS.setBranchID(rs.getString("BranchId"));
				brS.setSubjectsID(rs.getString("SubjectsID"));
				list.add(brS);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public void insertBranchSubjects(BranchSubjects brcS) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "insert into BranchSubjects (BranchId,SubjectsID) " + "VALUES ('" + brcS.getBranchID() + "','"
					+ brcS.getSubjectsID() + "')";
			System.out.println(sql);

			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	}


}
