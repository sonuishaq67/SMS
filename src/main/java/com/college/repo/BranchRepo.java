package com.college.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.college.model.Branch;
import com.college.utility.DatabaseConnectionUtility;


public class BranchRepo {
	public ArrayList<Branch> getAllBranch() {
		ArrayList<Branch> list = new ArrayList<Branch>();
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Select * from Branch";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Branch br = new Branch();
				br.setCourse(rs.getString("branchName"));
				br.setCourseId(rs.getString("branch_Id"));
				list.add(br);
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

	public void insertBranch(Branch brc) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Branch (branchName,branch_Id) " + "VALUES ('" + brc.getCourse() + "','"
					+ brc.getCourseId() + "')";
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

		System.out.println("insert student implemented......." + brc.getCourse() + "\n" + brc.getCourseId());
	}

	public void deleteBranch(String string) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Delete From Branch where branch_Id='" + string + "';";
			System.out.println(sql);

			stmt.executeUpdate(sql);

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
		System.out.println("deleted exam");
	}

	public void updateBranch(Branch brc) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "Update Branch set branchName='" + brc.getCourse() + "' where branch_Id='" + brc.getCourseId()+ "'";
			stmt.executeUpdate(sql);
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
	}
}
