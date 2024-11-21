<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
</head>
<body>
    <form action = "submit" method = "post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter your name" ><br><br>

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" placeholder="Enter your email" ><br><br>
        
        <label for="age">Age:</label>
        <input type="text" id="age" name="age" placeholder="Enter your age" ><br><br>

        <label for="phone">Phone Number:</label>
        <input type="text" id="phone" name="phone" placeholder="Enter your phone number"  ><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
