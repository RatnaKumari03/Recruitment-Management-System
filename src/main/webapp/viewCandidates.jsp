<%@ page import="java.util.List" %>
<%@ page import="com.rms.dao.UserDAO" %>
<%@ page import="com.rms.model.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Candidates</title>
</head>
<body>

<h2>All Registered Users</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Role</th>
    <th>Action</th>
</tr>

<%
UserDAO dao = new UserDAO();
List<User> users = dao.getAllUsers();

for(User user : users){
%>

<tr>
    <td><%= user.getId() %></td>
    <td><%= user.getName() %></td>
    <td><%= user.getEmail() %></td>
    <td><%= user.getRole() %></td>
    <td><a href="DeleteUserServlet?id=<%=user.getId() %>">Delete</a></td>
</tr>

<%
}
%>

</table>

<br><br>

<a href="adminDashboard.jsp">Back to Dashboard</a>

</body>
</html>