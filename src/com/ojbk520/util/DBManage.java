package com.ojbk520.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManage {
	// ��ȡһЩ���еĴ���
	static String DRIVER = "com.mysql.jdbc.Driver";
	static String URL = "jdbc:mysql://localhost:3306/website";
	static String USERNAME = "root";
	static String PWD = "123456";

	// �ر�����
	public static void colseAll(ResultSet rs, Statement stmt, Connection conn) {// �Ӳ���
		try {
			if (rs != null) {// ���˵û���ţ����ɶ�أ����ж���û�д򿪡�û�򿪵Ļ��ǲ��ǾͲ��ù���
				rs.close();// ������˾��Ƿǿ�
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("�ر�ʧ����");
			e.printStackTrace();
		}
	}

	public static Connection getConn() {// ������������ȡ���ݿ�����
		try {
			Class.forName(DRIVER);// 1.��������
			Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);// 2.��ȡ���ݿ�����
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
