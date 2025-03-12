<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.jsp.spring.vms.entity.Vehicle"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Vehicle vehicle = (Vehicle) request.getAttribute("vehicleobj");%>

	<h1>Enter Vehicle updated details</h1>
	
		<form action="save-updated-vehicle" method="post">
			<input type="number" value="<%=vehicle.getVehicleId()%>" name="vehicleId" readonly="readonly"><br>
			<input type="text" value="<%=vehicle.getVehicleModel()%>" name="vehicleModel"><br>
			<input type="text" value="<%=vehicle.getVehicleBrand()%>" name="vehicleBrand"><br>
			<input type="text" value="<%=vehicle.getVehicleType()%>" name="vehicleType"><br>
			<input type="number" value="<%=vehicle.getVehiclePrice()%>" name="vehiclePrice"><br>
			<input type="submit" value="UPDATE">
		</form>
</body>
</html>