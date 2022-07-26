<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW PATIENT</title>
</head>
<body style="background-color: powderblue; text-align: center";>
<h1>VIEW PATIENT</h1>
<form action="viewPatient" method="get">
Enter Patient Regno: <input type="text" name="pregno">
<input type="submit" value="View Patient"><br><br>
</form>
<form action="viewAllPatient" method="get">
<input type="submit" value="View All Patients"> 
</form>
</body>
</html>