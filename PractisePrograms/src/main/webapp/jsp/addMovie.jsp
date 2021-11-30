<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style = "margin: 8% 30% 0; padding: 1in 1.3in 0; width: 3.8in; height: 3.8in; background-color: #777777;">

<form action = "insertmovie" method= "post" style = "margin: -15% 30% 0;">

<input type = "text" name = "movieId" style = "height: .6cm;" placeholder = "Enter Movie ID"> <br> <br>

<input type = "text" name = "movieName" style = "height: .6cm;" placeholder = "Enter Movie Name"> <br> <br>

<input type = "text" name = "director" style = "height: .6cm;" placeholder = "Enter Director Name"> <br> <br>

<input type = "text" name = "hero" style = "height: .6cm;" placeholder = "Enter Hero Name"> <br> <br>

<input type = "text" name = "heroien" style = "height: .6cm;" placeholder = "Enter Heroien Name"> <br> <br>

<input type = "text" name = "language" style = "height : .6cm;" placeholder = "Movie Released Language"> <br> <br>

<input type = "date" name = "date" style = "height : .6cm;"> <br> <br>

<input type = "submit" value = "Add Movie" style = "height: 1cm; width: 4.5cm; display: block;">

</form>
</div>

</body>
</html>