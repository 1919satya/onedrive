<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table>
<tr>
<td>Account num</td>
<td>Amount</td>
<td>Account type</td>

</tr>
<c:forEach var="acc" items="${Accounts}">
   <tr>
   <td>${acc.accountnum}</td>
   <td>${acc.amount}</td>
   <td>${acc.accounttype}</td>
   </tr>
</c:forEach>
</table>
</center>
</body>
</html>