<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form:form action="calculation/processValues" method="post" commandName="calResDto">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Calculating Form</h2></td>
				</tr>
				
				<tr>
					<c:out value="${calResDto.operation}"></c:out>
					
	
			<c:forEach var="listValue" items="${calResDto.values}">
				
				<c:out value="${listValue}"></c:out>
				<c:out value="${calResDto.operation}"></c:out>
			</c:forEach>
	
					
					
				
				
				</tr>
				<tr>
				<c:out value="${calResDto.operation}"></c:out>
				</tr>
				<tr>
				<c:out value="${calResDto.values}"></c:out>
				</tr>
				
				<tr>
				<c:out value="${calResDto.resultValue}"></c:out>
				</tr>
				
				
			</table>
		</form:form>
	</div>
</body>
</html>