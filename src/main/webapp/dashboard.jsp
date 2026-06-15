<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(session.getAttribute("email") == null){
    response.sendRedirect("login.jsp");
    return;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>

<h1>Welcome to Recruitment Management System</h1>

<h3>Candidate Dashboard</h3>

<a href="profile.jsp">My Profile</a><br><br>
<a href="uploadResume.jsp">Upload Resume</a>
<br><br>
<a href="LogoutServlet">Logout</a>

</body>
</html>