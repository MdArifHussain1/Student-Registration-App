<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<!-- 
		<h2>Login Here</h2>
	<form action="verifyLogin" method="post">
		email<input type="text" name="email" /> password<input
			type="password" name="password" /> <input type="submit"
			value="login" />
	</form>
	 -->
	<style>
Body {
	background-image: url('bg_eclipse.jpg');
	font-family: Calibri, Helvetica, sans-serif;
	background-color: pink;
}

button {
	background-color: #4CAF50;
	width: 100%;
	color: black;
	padding: 15px;
	margin: 10px 0px;
	border: none;
	cursor: pointer;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid green;
	box-sizing: border-box;
}

button:hover {
	opacity: 0.7;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	margin: 10px 5px;
}

.container {
	padding: 25px;
	background-color: lightblue;
}
</style>
</head>
<body>
	<center>
		<h1><font color="#FFFF00">Student Login Form</font></h1>
	</center>
	<form action="verifyLogin" method="post">
		<div class="container">
			<label>Username : </label> <input type="text"
				placeholder="Enter Username" name="email" required> <label>Password
				: </label> <input type="password" placeholder="Enter Password"
				name="password" required>
				<input type="checkbox" name="ckbox"/>show password 
			<button type="submit">Login</button>
		</div>
	</form>
	<%
	if (request.getAttribute("error") != null) {
		out.println(request.getAttribute("error"));
	}
	%>

</body>
</html>








