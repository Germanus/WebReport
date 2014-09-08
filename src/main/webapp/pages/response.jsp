<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@page session="true" import="my.ilya.report.WebReportBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<jsp:useBean id="wb" scope="session" class="my.ilya.report.WebReportBean"></jsp:useBean>
<jsp:setProperty name="wb" property="*"/>
<% wb.processRequest(request); %>
<body>
	<%=wb.print()%>
</body>

</html>