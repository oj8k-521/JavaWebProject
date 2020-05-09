package com.ojbk520.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManage {
	// 提取一些共有的代码
	static String DRIVER = "com.mysql.jdbc.Driver";
	static String URL = "jdbc:mysql://localhost:3306/website";
	static String USERNAME = "root";
	static String PWD = "123456";

	// 关闭连接
	public static void colseAll(ResultSet rs, Statement stmt, Connection conn) {// 加参数
		try {
			if (rs != null) {// 如果说没有门，你关啥呢，先判断有没有打开、没打开的话是不是就不用关了
				rs.close();// 如果打开了就是非空
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭失败了");
			e.printStackTrace();
		}
	}

	public static Connection getConn() {// 加载驱动、获取数据库连接
		try {
			Class.forName(DRIVER);// 1.加载驱动
			Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);// 2.获取数据库连接
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
