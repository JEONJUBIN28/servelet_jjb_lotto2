package eud.ict.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldservlet
 */
@WebServlet("/hello")
public class HelloWorldservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World</h1>");
		out.print("<body>");
		out.print("<html>");
		out.close();
		
		System.out.println("doGet()..함수 입니다.");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		
		double total = Integer.valueOf(kor) + Integer.valueOf(eng);
				
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>총점</h1>");
		out.print("<h1>" + total + "</h1>");
		out.print("<body>");
		out.print("<html>");
		out.close();
		
		
	}

}
