package com.ojbk520.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		// ��ȡ����������
		String methodName = request.getParameter("method");
		Class c = this.getClass();// ��ȡ��ǰ��
		Method method = null;
		try {
			// ͨ����������ȡ��Ӧ����servlet�еķ���
			method = c.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
		} catch (Exception e) {
			throw new RuntimeException("��Ҫ���õķ�����" + methodName + "(HttpServletRequest,HttpServletResponse)���������ڣ�");
		}
		try {
			// ���÷�����������
			method.invoke(this, request, response);
			// System.out.println(methodName+"����ִ����");
		} catch (Exception e) {
			System.out.println("�����õķ�����" + methodName + ",�����ڲ��׳����쳣��");
			throw new RuntimeException(e);
		}
	}
}
