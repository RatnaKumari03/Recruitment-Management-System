<%@ page import="com.rms.dao.UserDAO" %>
<%@ page import="com.rms.model.User" %>

<%
String email = (String) session.getAttribute("email");

UserDAO dao = new UserDAO();
User user = dao.getUserByEmail(email);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

<h1>Candidate Profile</h1>

<p>Name : <%= user.getName() %></p>

<p>Email : <%= user.getEmail() %></p>

<p>Role : <%= user.getRole() %></p>

<a href="dashboard.jsp">Back to Dashboard</a>

</body>
</html>