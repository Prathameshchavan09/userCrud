<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ include file="./config.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  




<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>

<title>Users</title>
</head>
<body>


	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<div class="text-center mb-3"><strong><h3>User Details</h3></strong></div>


				<table class="table">
					<thead class="thead-dark text-center">
						<tr>
						    
							
						    <th scope="col">NAME</th>
							<th scope="col">CITY</th>
							<th scope="col">SALARY</th>
							<th scope="col"></th>
							<th scope="col"></th>
							
							
							
						</tr>
					</thead>
					<tbody class="text-center">
						<c:forEach items="${userAdded}" var="p">
						<tr>
							
							<td>${p.name}</td>
							<td>${p.city}</td>
							<td>${p.salary}</td>
						<!--  	<td><button type="submit" class="btn btn-outline-danger" >Delete</button></td> --> 
						 	<td><a href="delete/${p.id}" class="btn btn-outline-danger">Delete</a>
						 	<a href="UpdateUser/${p.id}" class="btn btn-outline-warning">Update</a></td>
						 	
						</tr>
						
						</c:forEach>
						
					</tbody>
				</table>
                    <div class="container text-center">
                   <a href="add" class="btn btn-outline-success">Add User</a>
                  
                   
                    </div>


			</div>
		</div>
	</div>



</body>
</html>