<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
body{
  background-image: url("404_error.jpg");
  background-color: #cccccc;
  height: 500px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  }
p{
  color:white;
  text-align: center;
  font-weight:blod;
  font-size:20px;

 
  
}
a{
color:red;

}

a:hover{
color:blue;

}







</style> 

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(response.getStatus() == 500){ %>
<font color="red">Error: <%=exception.getMessage() %></font><br>

<%-- include login page --%>
<%-- <%@ include file="Home.jsp"%> --%>
<%}else {%>

<p>Hi There, error code is <%=response.getStatus() %><br>
Please go to <a href="Home.jsp">home page</a></p>

<%} %>
<!-- <img alt="errorpage.jpg" src="404_error.jpg"> -->

</body>
</html>