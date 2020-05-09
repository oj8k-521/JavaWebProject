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
		// ����model�����ݲ�ѯ
		ArrayList<ListData> ListData = dao.getListData();
		ArrayList<NavData> NavData = dao.getNavData();
		ArrayList<ImgData> ImgData = dao.getImgData();
		request.setAttribute("ListData", ListData);//setAttribute() �������ָ�������ԣ���Ϊ�丳ָ����ֵ���������ݣ���getAttribute()��������ָ��������������ֵ����ȡ���ݣ�
		request.setAttribute("NavData", NavData);
		request.setAttribute("ImgData", ImgData);
		//request��
		//ͬһ������Χ��ʹ��request.setAttribute()��request.getAttribute()����ֵ��ǰһ��Servlet����setAttribute()����ֵ��
		//��һ��Servlet����getAttribute()��ȡֵ
		//request.getRequestDispatcher("").forward(request, response);//����ת��������һ��Servlet�����Ӧ�壡��ǰServlet����������Ӧͷ������ͷ�����壩
		//request.getRequestDispatcher("").include(request, response);//���������������Servlet��ͬ�����Ӧ�壡����ͷ�����壩
	}
}
