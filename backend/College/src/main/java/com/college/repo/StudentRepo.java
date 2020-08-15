package com.college.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.college.model.Student;
import com.college.utility.DatabaseConnectionUtility;

public class StudentRepo {
	public Student getAStudents() {
		return null;
	}

	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> list = new ArrayList();
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Select BranchID,ID_NO,Section,Roll_no,Name from Student";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Student st = new Student();
				st.setBranch(rs.getString("BranchID"));
				st.setiDNO(rs.getString("ID_NO"));
				st.setSection(rs.getString("Section"));
				st.setRollno(rs.getInt("Roll_no"));
				st.setName(rs.getString("Name"));
				list.add(st);
			}

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
		return list;

	}

	public void updateStudent(Student std) {

		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "update Student set BranchID='" + std.getBranch() + "',Name='" + std.getName() + "',Section='"
					+ std.getSection() + "',Roll_no='" + std.getRollno() + "' where ID_NO='" + std.getiDNO() + "'";
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

		System.out.println("insert student implemented......." + std.getName() + std.getBranch() + std.getiDNO()
				+ std.getSection() + std.getRollno());
	}

	public void insertStudent(Student std) {

		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Student (BranchID,ID_NO,Section,Roll_no,Name) " + "VALUES ('" + std.getBranch()
					+ "','" + std.getiDNO() + "','" + std.getSection() + "'," + std.getRollno() + ",'" + std.getName()
					+ "')";
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

		System.out.println("insert student implemented......." + std.getName() + std.getBranch() + std.getiDNO()
				+ std.getSection() + std.getRollno());
	}

	public void deleteStudent(String string) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Delete From Student where ID_NO ='" + string + "';";
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

		System.out.println("delete student implemented");
	}
}

