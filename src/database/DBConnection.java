//package database;
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class DBConnection {
//	private Connection con;
//	private Statement st;
//	private ResultSet rs;
//	public DBConnection() {
//		try {
//			System.out.println("1");
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("2");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/230611test","admin","1234");
//			System.out.println("3");
//			st = con.createStatement();
//			System.out.println("4");
//		} catch(Exception e) {
//			System.out.println("4-1");
//			System.out.println("데이터베이스 연결오류 : " + e.getMessage());
//		}
//	}
//	public boolean isAdmin(String adminID, String adminPassword) {
//		System.out.println("5");
//		try {
//			System.out.println("6");
//			String SQL = "select * from admin where adminID = '" + adminID + "' and adminPassword = '" + adminPassword + "'";
//			System.out.println("7");
//			rs = st.executeQuery(SQL);
//			System.out.println("8");
//			if(rs.next()) {
//				System.out.println("9");
//				return true;
//			}
//		} catch(Exception e) {
//			System.out.println("10");
//			System.out.println("데이터베이스 검색오류 : " + e.getMessage());
//		}
//		return false;
//	}
//}

package database;

 

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

 

public class DBConnection {

private Connection con;

private Statement st;

private ResultSet rs;


public DBConnection() {

	try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/230611test","root","7918");
		
		st = con.createStatement();
		
		
		
	} catch(Exception e) {
	
		System.out.println("데이터베이스 연결오류 : " + e.getMessage());
	
	}
	
}
	
	
public boolean isAdmin(String adminID, String adminPassword) {
	
	try {
	
		String SQL = "select * from admin where adminID = '" + adminID + "' and adminPassword = '" + adminPassword + "'";
		
		rs = st.executeQuery(SQL);
		
		if(rs.next()) {
		
			return true;
		
		}
	
	} catch(Exception e) {
	
		System.out.println("데이터베이스 검색오류 : " + e.getMessage());
	
	}
	
	return false;
	
	}

}