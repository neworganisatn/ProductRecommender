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
		<form:form action="processValues" method="post" commandName="calInputReqDto">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Calculating Form</h2></td>
				</tr>
				
				<tr>
					<c:forEach items="${calInputReqDto.values}" varStatus="i">
  						<form:input path="values[${i.index}]"/>
  						
					</c:forEach>
					
				</tr>
				<tr>
				<form:hidden path="operation"/>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Calculate" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>