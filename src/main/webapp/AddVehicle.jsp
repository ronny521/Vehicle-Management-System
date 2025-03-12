<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 		<h1>Enter the Vehicle details</h1>
		<form action="add-vehicle" method="post">
			<input type="number" placeholder="Enter Vehicle Id" name="vehicleId" ><br>
			<input type="text" placeholder="Enter Vehicle Model" name="vehicleModel"><br>
			<input type="text" placeholder="Enter Vehicle Brand" name="vehicleBrand"><br>
			<input type="text" placeholder="Enter Vehicle Type" name="vehicleType"><br>
			<input type="number" placeholder="Enter Vehicle Price" name="vehiclePrice"><br>
			<input type="submit" value="ADD">
		</form>
</body>
</html>