<%-- 
    Document   : failure
    Created on : 2023.1 
    Author     : park
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%
session.invalidate();   
%>
<script>
	alert("로그아웃 되었습니다.");
	location.href="a08_login_main.jsp"; 
</script>	
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="color:red">
            <h1>Invalid user name  </h1>
        </div>
        alert('로그인 실패\n로그인 페이지 이동합니다.');
		location.href="a08_login_main.jsp";
    </body>
</html>

