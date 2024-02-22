<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Portal</title>
</head>
<body>
<style>
Body{
background-image: url('gradient_wall.jpg');
}
		h1 {text-align: center;}
		h3 {text-align: center;}
		h4 {text-align: center;}
</style>
	<h1>~What do you want to do~</h1>	
	<h3><a href="saveReg">Create Registration</a></h3>
	<h3><a href="listall">List All Registrations</a></h3>
	<form action="logOut" method="post">
	<h4><input type="submit" value="Log out"/></h4>
	</form>
</body>
</html>