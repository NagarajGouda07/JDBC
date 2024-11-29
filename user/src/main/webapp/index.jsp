<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Management</title>
</head>
<body>
    <h1>User Management System</h1>
    
    <!-- Form to Register a New User -->
    <h2>Register User</h2>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" value="register">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required><br><br>
        
        <label for="phone">Phone:</label>
        <input type="text" name="phone" id="phone" required><br><br>
        
        <label for="address">Address:</label>
        <input type="text" name="address" id="address" required><br><br>
        
        <label for="message">Message:</label>
        <input type="text" name="message" id="message" required><br><br>
        
        <button type="submit">Register</button>
    </form>
    <hr>
    
    <!-- Fetch All Users -->
    <h2>View All Users</h2>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" value="getAll">
        <button type="submit">Fetch All Users</button>
    </form>
    <hr>
    
    <!-- Fetch User by ID -->
    <h2>Get User by ID</h2>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" value="getById">
        <label for="userId">User ID:</label>
        <input type="number" name="id" id="userId" required><br><br>
        <button type="submit">Fetch User</button>
    </form>
    <hr>
    
    <!-- Update User Name by Email -->
    <h2>Update User Name</h2>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" value="update">
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br><br>
        <label for="newName">New Name:</label>
        <input type="text" name="newName" id="newName" required><br><br>
        <button type="submit">Update Name</button>
    </form>
    <hr>
    
    <!-- Delete User by ID -->
    <h2>Delete User</h2>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" value="delete">
        <label for="deleteId">User ID:</label>
        <input type="number" name="id" id="deleteId" required><br><br>
        <button type="submit">Delete User</button>
    </form>
</body>
</html>
