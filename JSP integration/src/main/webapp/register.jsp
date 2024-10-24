<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>This is Register Page using JSP</h2>
$ {name}
$ {email }
$ {address}
$ {age}
$ {phone_no}
<form action="Register" method="post">
<Pre>
Name:     <input type="text" name="name">
Email:    <input type="text" name="email">
Address:  <input type="text" name="address">
Age:      <input type="text" name="age">
Phone_No: <input type="text" name="phone_no">

        <input type="Submit" value="Register">

</Pre>
</form>

</body>
</html>