<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Student</h1>
        <form:form action="saveStudent" method="post" modelAttribute="student">
        <table>
            <form:hidden path="rollNo"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="sName" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                Gender:
                
                <input type="radio" name="gender" value="male" >male</input>
                <input type="radio" name="gender" value="female" >female</input>
                
                
            </tr>
            <tr> <br/><br/>
            
                Country :
                <select input name="country"><br/><br/><br/><br/>
                
                <option value="Usa" >Usa</option>
                <option value="russia" >russia</option>
                <option value="Canada" >Canada</option>
                <option value="India" >India</option>
                
                </select>
            </tr>
            <tr>
                <td>Date of Join:</td>
                <td><input type="date" name="dateofJoin" /></td>
            </tr>
            <tr>
                <td>FinalScore:</td>
                <td><form:input path="finalScore" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>