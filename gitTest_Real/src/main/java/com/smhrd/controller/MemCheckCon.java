package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.MemberDAO;

public class MemCheckCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		
		MemberDAO dao = new MemberDAO();
		boolean check = dao.emailCheck(mem_id); //-> 응답데이터
		//check : 사용할 수 있는 아이디 -> true
		//		  사용할 수 없는 아이디 -> false		
		
		//클라이언트에게 응답(데이터를 출력) 
		PrintWriter out = response.getWriter();
		//check -> boolean
		//print -> 텍스트 출력 (boolean -> 문자열"true"/"false")
		out.print(check);
		
	}

}
