<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE PATIENT</title>
</head>
<body style ="text-align: center; background-color: powderblue";>
<h1>Update Patient</h1>
<form action="updatePatient" method="get">
		Patient Regno:<br> <input type="text" name="pregno"><br>
		<br> Patient Name:<br> <input type="text" name="pname"><br>
		<br> Patient Bedno:<br> <input type="text" name="pbedno"><br>
		<br> Patient Bill:<br> <input type="text" name="pbill"><br>
        <br> Patient Medicine:<br> <input type="text" name="pmedicines"><br>
		<br> <input type="submit" value="UPDATE PATIENT">

	</form>
</body>
</html>