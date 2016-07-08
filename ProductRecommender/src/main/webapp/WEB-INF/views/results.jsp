<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:)</title>
</head>
<body>


<table>

    <c:forEach items="${productList}" var="product">
    
      
    

        <tr>
             
            <td><img src='${product.imageLink}' alt="Smiley face" height="200" width="200"></td>  
            <td>
            <table>
            <tr>
            <td><c:out value="${product.name}"/></td>
            </tr>
            <tr>
            <td>Price : $ <c:out value="${product.price}"/>
            </td>
            </tr>
            <tr>
            <td><a href='${product.link}'>click hear to view on Best Buy</a></td>
            </tr>
            
            </table>
          
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>