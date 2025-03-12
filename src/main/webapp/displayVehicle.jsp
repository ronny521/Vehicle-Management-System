<%@page import="java.util.List"%>
<%@page import="com.jsp.spring.vms.entity.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%List<Vehicle> vehicles =(List<Vehicle>) request.getAttribute("vehicleList"); %>
		<h1>Vehicle Details</h1>
		<table border="1">
		<tr>
		<th>Vehicle Id</th>
		<th>Vehicle Model</th>
		<th>Vehicle Brand</th>
		<th>Vehicle Type</th>
		<th>Vehicle Price</th>
		<th>Update</th>
		<th>Delete</th>
		</tr>
		
		<%if(vehicles.isEmpty()==false)
		{
			for(Vehicle vehicle: vehicles)
			{
		%>
		<tr>
		<td><%=vehicle.getVehicleId() %></td>
		<td><%= vehicle.getVehicleModel()%></td>
		<td><%= vehicle.getVehicleBrand()%></td>
		<td><%= vehicle.getVehicleType()%></td>
		<td><%= vehicle.getVehiclePrice()%></td>
		<td><a href="find-vehicle-by-Id?vehicleId=<%=vehicle.getVehicleId()%>">UPDATE</a></td>
		<td><a href="delete-vehicle?vehicleId=<%=vehicle.getVehicleId()%>">DELETE</a></td>
		</tr>
		
		<%}
		}
		%>
		</table>
		
	<a href="index.jsp">Go to Dashboard</a>
</body>
</html>