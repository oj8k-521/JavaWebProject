package com.ojbk520.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ojbk520.entity.ImgData;
import com.ojbk520.entity.ListData;
import com.ojbk520.entity.NavData;
import com.ojbk520.util.DBManage;

public class DataDao {
	public ArrayList<ListData> getListData() {
		ArrayList<ListData> list = new ArrayList<ListData>();
		try {
			Connection conn = DBManage.getConn();
			Statement stam = conn.createStatement();
			ResultSet rs = stam.executeQuery("select title,content from column_data");//数据库获取数据
			while (rs.next()) {
				ListData d = new ListData(rs.getString("title"), rs.getString("content"));
				list.add(d);
			}
			DBManage.colseAll(rs, stam, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<NavData> getNavData() {
		ArrayList<NavData> list = new ArrayList<NavData>();
		try {
			Connection conn = DBManage.getConn();
			Statement stam = conn.createStatement();
			ResultSet rs = stam.executeQuery("select nav from column_data");
			while (rs.next()) {
				NavData d = new NavData(rs.getString("nav"));
				list.add(d);
			}
			DBManage.colseAll(rs, stam, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<ImgData> getImgData() {
		ArrayList<ImgData> list = new ArrayList<ImgData>();
		try {
			Connection conn = DBManage.getConn();
			Statement stam = conn.createStatement();
			ResultSet rs = stam.executeQuery("select img_title,img_src,img_href from column_data");
			while (rs.next()) {
				ImgData d = new ImgData(rs.getString("img_title"),rs.getString("img_src"), rs.getString("img_href"));
				list.add(d);
			}
			DBManage.colseAll(rs, stam, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
