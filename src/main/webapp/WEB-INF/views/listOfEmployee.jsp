<jsp:include page="prevent.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
	<table class="table table-bordered table-dark">
		<thead>
			<tr>
				<th scope="col">EID</th>
				<th scope="col">USERNAME</th>
				<%
					String type = (String) session.getAttribute("type");
					if (type.equalsIgnoreCase("admin")) {
				%>
				<th scope="col">PASSWORD</th>
				<th scope="col">QUESTION</th>
				<th scope="col">ANSWER</th>
				<%
					}
				%>


				<th scope="col">GENDER</th>
				<th scope="col">MAIL</th>
				<th scope="col">STATUS</th>
				<th scope="col">TYPE</th>
				
				<%
						if (type.equalsIgnoreCase("admin")) {
					%>
				<th scope="col">ACTION</th>
				<%
				}
				%>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td><c:out value="${emp.eid}"></c:out></td>
					<td><c:out value="${emp.username}"></c:out></td>
					<%
						if (type.equalsIgnoreCase("admin")) {
					%>
					<td><c:out value="${emp.password}"></c:out></td>
					<td><c:out value="${emp.question}"></c:out></td>
					<td><c:out value="${emp.answer}"></c:out></td>
					<%
						}
					%>
					<td><c:out value="${emp.gender}"></c:out></td>
					<td><c:out value="${emp.mail}"></c:out></td>
					<td><c:out value="${emp.status}"></c:out></td>
					<td><c:out value="${emp.type}"></c:out></td>
					<%
						
							if (type.equalsIgnoreCase("admin")) {
					%>
					<td><a href="profile?username=${emp.username}">UPDATE</a> | <a
						href="deleteEmployee?id=${emp.eid}">DELETE</a></td>
					<%
						}
					%>

				</tr>


			</c:forEach>

		</tbody>
	</table>
</body>
</html>