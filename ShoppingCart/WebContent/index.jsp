<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Welcome to Adarsh's BookStore!!!</h2>

	<h2>Search Books Here</h2>

	<form action="searchBooks.jk">
		<font color="red" size="5"> ${MSG} </font>
		<table>
			<tr>
				<td>Select Category</td>
			</tr>
			<tr>
				<td><select name="category">  
						<option value="">-----Select Category</option>
						<option value="Java">Java Programming</option>
						<option value="Python">Python Programming</option>
						<option value="Web">Web Development</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Show Books" /></td>
			</tr>
		</table>
	</form>

</body>
</html>
