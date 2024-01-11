<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="addmovie" method = "post">
<label for="mid"> MovieId</label>
<input type = "number" id="mid" name="movieid"><br><br>
<label for="mname"> Movie Name</label>
<input type = "text" id="mname" name="moviename"><br><br>
<label for="mprice"> Movie Price</label>
<input type = "number" id="mprice" name="movieprice"><br><br>
<label for="mrate"> Movie Rating</label>
<input type = "number" id="mrate" name="movierating"><br><br>
<label for="mgenere"> Movie Genere</label>
<input type = "text" id="mgenere" name="moviegenere"><br><br>
<label for="mlang"> Movie Language</label>
<input type = "text" id="mlang" name="movielang"><br><br>
<label for="mimg"> Movie Image</label>
<input type = "file" id="mimg" name="movieimg"><br><br>
<input type ="submit" >
</form>

</body>
</html>