package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eud.ict.shape.Circle;

/**
 * Servlet implementation class HelloWorldservlet
 */
@WebServlet("/area")
public class CircleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CircleServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double radius = Double.valueOf(request.getParameter("radiuse"));

		double area = radius * radius * Math.PI;

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + "원의 면적" + "</h1>");
		out.print("<p>원의 넓이" + area + "<p>");
		out.print("<body>");
		out.print("<html>");
		out.close();
		
		System.out.println("doGet()..함수 입니다.");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double radius = Double.valueOf(request.getParameter("radiuse"));

		Circle circle = new Circle(radius);
		
		

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + "원의 면적" + "</h1>");
		out.print("<p>원의 넓이: " + circle.getArea() + "<p>");
		out.print("<body>");
		out.print("<html>");
		out.close();

	}

}
