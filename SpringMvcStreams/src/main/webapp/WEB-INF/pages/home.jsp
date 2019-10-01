<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="v"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		
		<v:form action="searchEmployee"  method="POST" modelAttribute="searchEmployee">
		    Employ Name: <v:input path="empName" />
		   <br/><br/>
		   Band:
		   <v:select path="band">
		   <v:option value="0">None</v:option>
		   
		   <v:option value="E">E</v:option>
		   <v:option value="C">C</v:option>
		   <v:option value="M">M</v:option>
		    </v:select>
		   <br/><br/>
		   Salary:
		    <v:input path="salary" />
		   <br/><br/>
		  
		    <input type="submit" value="Search" />
		</v:form>
		<h2>No of Employees."${listEmployee.size()}"</h2>
		<table border=2>
            <tr><th>Emp Name</th>
			<th>Emp DOJ</th>
			<th>Band</th>
			<th>Salary</th>
</tr>
			<c:forEach var="emp" items="${listEmployee}">
				<tr>

					<td>${emp.empName}</td>
					<td>${emp.dateOfJoin}</td>
					<td>${emp.band}</td>
					<td>${emp.salary}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>