package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eud.ict.shape.Rectangle;



/**
 * Servlet implementation class HelloWorldservlet
 */
@WebServlet("/rectangle")
public class RectangleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RectangleServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double width = Double.valueOf(request.getParameter("width"));
		double height = Double.valueOf(request.getParameter("height"));
		
		Rectangle rectangle = new Rectangle(width, height);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + "사각형의 면적" + "</h1>");
		out.print("<p>사각형의 넓이" + rectangle.getArea() + "<p>");
		out.print("<body>");
		out.print("<html>");
		out.close();
		
		System.out.println("doGet()..함수 입니다.");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double width = Double.valueOf(request.getParameter("width"));
		double height = Double.valueOf(request.getParameter("height"));
		
		Rectangle rectangle = new Rectangle(width, height);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>" + "사각형의 면적" + "</h1>");
		out.print("<h1>사각형의 넓이 " + rectangle.getArea() + "<h1>");
		out.print("<h1>가로: " + width + "</h1>");
		out.print("<h1>세로: " + height + "</h1>");
		out.print("<body>");
		out.print("<html>");
		out.close();

	}

}
