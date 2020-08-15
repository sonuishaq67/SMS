package com.college.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.college.model.Exam;
import com.college.utility.DatabaseConnectionUtility;


public class ExamRepo {
	public ArrayList<Exam> getAllExams() {
		ArrayList<Exam> list = new ArrayList<Exam>();
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Select * from Exams";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Exam ex = new Exam();
				ex.setID_No(rs.getString("Branch_ID"));
				ex.setType(rs.getString("Type"));
				ex.setDate(rs.getString("Date"));
				ex.setSubjectId(rs.getString("SubjectId"));
				list.add(ex);
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

	public void createExam(Exam ex) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Exams (Type,date,ID_NO) " + "VALUES ('" + ex.getType() + "','" + ex.getDate()
					+ "','" + ex.getID_No() + "')";
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

		System.out.println("insert student implemented......." + ex.getType() + ex.getDate() + ex.getID_No());

	}

	public void deleteExam(String string) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Delete From Exams where Type ='"+string+"';";
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
				e.printStackTrace();
			}
		}

		System.out.println("delete exams implemented");
	}

	public void updateExam(Exam ex) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt=null;
		try 
		{
			stmt =conn.createStatement();
			String sql="Update Exams set Date='"+ex.getDate()+"',ID_NO='"+ex.getID_No()+"' where Type='"+ex.getType()+"'";
			System.out.println(sql);
			stmt.executeUpdate(sql);
		}catch(SQLException e) {
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
