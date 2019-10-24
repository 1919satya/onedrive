package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchPrint
 */
public class SearchPrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPrint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibraryDAO dao=new LibraryDAO();
		String searchtype = request.getParameter("searchtype");		
		String searchvalue = request.getParameter("searchvalue");
		List<Library> books=dao.searchBook(searchtype, searchvalue);
		PrintWriter out=response.getWriter();
		//out.println(books.size());
		out.println("<table border='3'>");
		out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th>");
		out.println("<th>Edition</th><th>Dept</th><th>TotalBooks</th></tr>");
		for (Library library : books) {
			out.println("<tr><td>" +library.getId() + "</td>");
			out.println("<td>" +library.getName() + "</td>");
			out.println("<td>" +library.getAuthor() + "</td>");
			out.println("<td>" +library.getEdition() + "</td>");
			out.println("<td>" +library.getDept() + "</td>");
			out.println("<td>" +library.getTotalBooks() + "</td> ");
			if(library.getTotalBooks() > 0)
				out.write("<td><input type='checkbox' name='bookid' value="+library.getId()+"></td></tr>");		
			else
				out.write("<td><input type='checkbox' name='bookid' disabled='true' value="+library.getId()+"></td></tr>");
				
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
