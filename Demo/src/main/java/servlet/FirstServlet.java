package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test1")
public class FirstServlet implements Servlet {

	public FirstServlet() {

	}

	public void init(ServletConfig config) throws ServletException {

		System.out.println("servlet is initialized");
	}

	public void destroy() {
		System.out.println("servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=lightyellow text=black><h1>");
		pw.println("Servlet Program Using Servlet Interface.......");
		pw.println("</h1></body></html>");
	

	}

}
