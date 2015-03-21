package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccessObject {
	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			// Store the database URL in a string
		/* Oracle jdbc
		String serverName = "127.0.0.1";
		String portNumber = "1521";
		String sid = "XE";
		String dbUrl = "jdbc:oracle:thin:@" + serverName + ":" + portNumber
				+ ":" + sid;*/
		
		 //ȡ�����ӵ�url,�ܷ���MySQL���ݿ���û���,���룻studentinfo�����ݿ���
        String dbUrl = "jdbc:mysql://localhost:3306/changyouDB";     
		try {
		   // Class.forName("oracle.jdbc.driver.OracleDriver");
		   Class.forName("com.mysql.jdbc.Driver");
		   // set the url, username and password for the database
		   // connection = DriverManager.getConnection(dbUrl, "system", "admin");
		   
		   //�ڶ�����������MySQL���ݿ���������ʵ��
		   connection = DriverManager.getConnection(dbUrl, "changyou", "changyou");      
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	}
}