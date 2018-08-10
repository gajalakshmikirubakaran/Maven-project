<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
			<tr>
				<th class="trow">Session Name</th>
				<th class="trow">Duration (Days)</th>
				<th class="trow">Faculty</th>
				<th class="trow">Mode</th>
			</tr>
			<c:forEach items="${sessiondata}" var="obj">
			<tr>
				<td class="trow">${obj.name}</td>
				<td class="trow">${obj.duration}</td>
				<td class="trow">${obj.faculty}</td>
			    <td class="trow">${obj.mode1}</td>
				<td class="trow1"><a href="update/${obj.id}">Update</a></td>
			</tr>
			 </c:forEach> 
		</table>

</body>
</html>