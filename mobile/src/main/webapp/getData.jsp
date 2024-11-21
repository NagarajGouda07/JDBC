<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details Form</title>
</head>
<body>
    <h1>getdata</h1>
    <form action="getData" method="post">
        <label for="age">Enter Age:</label>
        <input type="text" id="age" name="age" placeholder="Enter age" /><br><br>

        <label for="name">Enter Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter name" /><br><br>

        <label for="email">Enter Email:</label>
        <input type="text" id="email" name="email" placeholder="Enter email" /><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
