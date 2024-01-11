<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="asignup" method="post">
<label for="aid">Admin Id</label>
<input type="text" id="aid" name="adminid"><br><br>
<label for="aname">Name</label>
<input type="text" id="aname" name="adminname"><br><br>
<label for="acon">Contact</label>
<input type="number" id="acon" name="admincontact"><br><br>
<label for="amail">Email</label>
<input type="email" id="amail" name="adminmail"><br><br>
<label for="apass">Password</label>
<input type="password" id="apass" name="adminpassword"><br><br>
<input type="submit">

</form>
</body>
</html>