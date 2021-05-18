package com.learning.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCExample {

	public static void main(String[] args) {
		Connection  connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
				
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference_demo","root","root");
			statement = connection.createStatement();
			String sql = "insert into java_learing_sai values(1,'sai','virginia')";
			statement.execute(sql);
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(statement!= null) {
					
				
				statement.close();
				}
				if(connection!= null) {
				connection.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

		}
}
