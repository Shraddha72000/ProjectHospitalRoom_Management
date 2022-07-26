<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.HospitalRoomManagement.entity.HospitalRoom"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW PATIENT</title>
</head>
<body>
<h1>VIEW PATIENT</h1>
<%
String mode = (String)request.getAttribute("mode");
if(mode.equals("single")){
	boolean flag = (Boolean) request.getAttribute("flag");
	if(flag){
		HospitalRoom h = (HospitalRoom)request.getAttribute("result");
		out.println("<table border=1px><tr><th>Patient REGNO</th><th>Patient Name</th><th>Patient BEDNO</th><th>Patient BILL</th><th>Patient MEDICINES</th></tr>");
		out.println("<tr><td>" + h.getPregno() + "</td><td>" + h.getPname() + "</td><td>" + h.getPbedno() + "</td><td>" + h.getPbill()+"</td><td>" + h.getPmedicines()
		+ "</td></tr></table>");
	} else {
		out.println("<h1> " + (String) request.getAttribute("result") + "</h1>");
	}
} else if (mode.equals("list")){
	List<HospitalRoom> hlist = (List<HospitalRoom>)request.getAttribute("result");
	out.println("<table border=1px><tr><th>Patient REGNO</th><th>Patient NAME</th><th>Patient BEDNO</th><th>Patient BILL</th><th>Patient MEDICINES</th></tr>");
	for(HospitalRoom h:hlist){
		out.println("<tr><td>" + h.getPregno() + "</td><td>" + h.getPname() + "</td><td>" + h.getPbedno() + "</td><td>" + h.getPbill()+"</td><td>" + h.getPmedicines()+ "</td></tr>");
	}
	out.println("</table>");
}

%>

</body>
</html>