<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>JDBC Speaker Application</h1>
	<form action="process.jsp" method="post">
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" required> <label for="email">Email:</label> <input
			type="email" id="email" name="email" required> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" required> <label for="phone">Phone:</label> <input
			type="text" id="phone" name="phone" required> <label
			for="message">Message:</label> <input type="text" id="message"
			name="message">

		<button type="submit">Submit</button>
	</form>

</body>
</html>