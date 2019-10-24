package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

	Connection connection;
	public List<Library> searchBook(String searchtype,String srchValue) {
		List<Library> lstBooks=new ArrayList<Library>();
		String sql="";
		connection=DaoConnection.getConnection();
		if(searchtype.equals("id")){
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		}			
		else if(searchtype.equals("bookname"))
		{
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		}
		else if(searchtype.equals("authorname")){
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		}
		else if(searchtype.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else sql = " SELECT * FROM Books WHERE Name != ? OR 1 = 1 " ;
		Library book=null;
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,srchValue);		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				book=new Library();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setDept(rs.getString("dept"));
				book.setAuthor(rs.getString("author"));
				book.setEdition(rs.getString("edition"));
				book.setTotalBooks(rs.getInt("totalBooks"));
				lstBooks.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstBooks;
	}
}
