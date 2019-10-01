<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Student</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Student</h1>
		<form:form action="saveStudent" method="post" modelAttribute="student">
			<table border="4" bgcolor="brown" style="color: white">
				<form:hidden path="id" />
				<tr>
					<td>Roll Num:</td>
					<td><form:input path="rollNo" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><form:radiobutton path="gender" value="M" />Male 
					<form:radiobutton path="gender" value="F" />Female </td>

				</tr>
				<tr>
					<td>Country</td>
					<td><form:select path="country">
							<form:option value="None">Select</form:option>
							<form:option value="India">India</form:option>
							<form:option value="Us">Us</form:option>
							<form:option value="Canada">Canada</form:option>
							<form:option value="Russia">Russia</form:option>

						</form:select></td>

				</tr>
				<tr>
					<td>date of join:</td>
					<td><form:input type="date" path="dateofJoin"></form:input></td>
				</tr>
				<tr>
					<td>final Score:</td>
					<td><form:input path="finalScore" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>