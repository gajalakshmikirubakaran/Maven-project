<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:form action="/mpt/updateemployee" method="post" modelAttribute="up">
<table>

<tr>
<td>ID</td>
<td><input type="text" name="id" value="${modelupdate.id}" readonly/></td>
</tr>

<tr>
<td>Name</td>
<td><input type="text" name="name" value="${modelupdate.name}"/></td>
<td><c:errors path="name"></c:errors>
</tr>


<tr>
<td>Duration</td>
<td><input type="text" name="duration" value="${modelupdate.duration}"/></td>
<td><c:errors path="duration"></c:errors>
</tr>

<tr>
<td>Faculty</td>
<td><input type="text" name="faculty" value="${modelupdate.faculty}"/></td>
<td><c:errors path="faculty"></c:errors>
</tr>


<tr>
<td>Mode</td>
<td><input type="text" name="mode1" value="${modelupdate.mode1}"/></td>
<td><c:errors path="faculty"></c:errors>
</tr>

<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>

</c:form>

</body>
</html>