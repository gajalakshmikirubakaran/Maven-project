<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>duration</th>
<th>faculty</th>
<th>Mode</th>
</tr>

<a:forEach items="${sessiondata}" var="obj">
<tr>
<td>${obj.id}</td>
<td>${obj.name}</td>
<td>${obj.duration}</td>
<td>${obj.faculty}</td>
<td>${obj.mode1}</td>
<!-- <td><input type="submit" value="Update"></td> -->
<td><a href="update/${obj.id}">Update</a><td>
</tr>
</a:forEach>
</table>
</body>
</html>