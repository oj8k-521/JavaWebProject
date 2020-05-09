package com.ojbk520.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojbk520.dao.impl.DataDao;
import com.ojbk520.entity.ImgData;
import com.ojbk520.entity.NavData;
import com.ojbk520.entity.ListData;
import com.ojbk520.util.BaseServlet;

@WebServlet("/DataServlet")
public class DataServlet extends BaseServlet {

	DataDao dao = new DataDao();
	
	public void selectAllData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 调用model做数据查询
		ArrayList<ListData> ListData = dao.getListData();
		ArrayList<NavData> NavData = dao.getNavData();
		ArrayList<ImgData> ImgData = dao.getImgData();
		request.setAttribute("ListData", ListData);//setAttribute() 方法添加指定的属性，并为其赋指定的值（保存数据）。getAttribute()方法返回指定属性名的属性值（获取数据）
		request.setAttribute("NavData", NavData);
		request.setAttribute("ImgData", ImgData);
		//request域
		//同一个请求范围内使用request.setAttribute()和request.getAttribute()来传值！前一个Servlet调用setAttribute()保存值，
		//后一个Servlet调用getAttribute()获取值
		//request.getRequestDispatcher("").forward(request, response);//请求转发：由下一个Servlet完成响应体！当前Servlet可以设置响应头！（留头不留体）
		//request.getRequestDispatcher("").include(request, response);//请求包含：由两个Servlet共同完成响应体！（留头又留体）
	}
}
