<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type ="text/css">
{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    outline: none;
}

body {
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: rgb(107, 167, 150);
    min-height: 100vh;
    margin: 0;
}
.container{
    background-color: rgb(216, 216, 198);
    padding: 30px 30px;
    overflow: hidden;
    border-radius: 10px;

}
.Form{
    padding: 5px 5px;

}
.field{
    position: relative;
    margin-bottom: 5px;
    padding-bottom: 10px;
}

.Form .button{
    background-color: blue;
    border: 2px solid blue;
    color: #f3e6e6;
    padding: 8px;
    display: block;
    width: 100%;
    font-size: 16px;
}
</style>
</head>

<body>
	<div>
		<form action="sign" method="post">
			<h1>Registration Form</h1>
			<br>
			<div class="field">
				<label for="">Name </label> <input type="text" placeholder="xyz"
					id="uname" name ="name">
			</div>

			<div class="field">
				<label for="">LastName </label> <input type="text" placeholder="xyz"
					id="lname" name="lname">
			</div>

			<div class="field">
				<label for="">Email </label> <input type="email"
					placeholder="xyz@gmail.com" id="email" name ="email">
			</div>

			<div class="field">
				<label for="">Password </label> <input type="password"
					placeholder="password" id="pass" name ="password">
			</div>
			
			 <button type="submit" class="button">Submit</button>
            

		</form>
	</div>

</body>
</html>