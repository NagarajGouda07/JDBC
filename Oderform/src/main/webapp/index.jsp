<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: #fff;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 10px;
        }

        label {
            font-weight: bold;
            color: #555;
            margin-bottom: 5px;
            display: block;
        }

        input[type="text"], input[type="number"], input[type="email"], input[type="submit"] {
            width: 100%;
            padding: 5px;
            margin-bottom:5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 15px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .form-container pre {
            display: none; /* Remove pre formatting */
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Item Order Form</h2>
        <form action="order" method="post">
        
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email</label>
            <input type="text" id="email" name="email" required>

            <label for="phone">Phone</label>
            <input type="number" id="phone" name="phone" required>

            <label for="address">Street Address</label>
            <input type="text" id="address" name="address" required>

            <label for="city">City</label>
            <input type="text" id="city" name="city" required>

            <label for="pincode">Pincode</label>
            <input type="number" id="pincode" name="pincode" required>


            <input type="submit" value="Submit">
        </form>
    </div>

</body>
</html>