<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>

<html>
<head>
<style>
table {   /*css */
	width: 90%;
	border: 1px solid red;
	border-collapse: collapse;
}

tr {
	height: 30px;
}

td {
	border: 1px solid red;
	border-collapse: collapse;
	padding: 5px;
}
</style>
</head>

<body>
	<h2>Welcome to Adarsh's BookStore!!!</h2>
	<h2>Books available for ${CAT} Category</h2> 

	<div>
		<form action="showMyCart.jk">
			<input type="submit" value="Show My Cart" />
		</form>
	</div>

	<table>
		<%
		Object obj = session.getAttribute("BooksList");
		if (obj != null) {
			List<String> bookList = (List<String>) obj;
			int count = 1;
			for (String bname : bookList) {
		%>
		<tr>
			<td><%=count++%></td>
			<td><%=bname%></td>
			<td>Rs.250</td>
			<td>10% off</td>
			<td>
				<form action="addToCart.jk">
					<input type="hidden" name="bname" value="<%=bname%>" /> <input
						type="submit" value="Add To Cart" />
				</form>
			</td>
		</tr>
		<%
}
}
%>
	</table>
</body>
</html>
