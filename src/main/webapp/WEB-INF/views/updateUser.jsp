<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./config.jsp"%>

<%@page isELIgnored="false" %>

<title>Update User</title>
</head>
<body>


	<div class="container mt-3">

		<div class="row">

		<div class="col-md-6 offset-md-3" >
			<h1 class="text-center mb-3 ">Update User</h1>

			<form action="${pageContext.request.contextPath}/addProcess" method="POST">
			<input type="hidden" value="${user.id}" name="id" />
				<div class="form-group">
					<label for="exampleInputEmail1">Name</label> <input
						name="name" type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp"
						placeholder="name" value="${user.name}" >
						
				</div>
				
				
				<div class="form-group">
					<label for="exampleInputPassword1">City</label> <input name="city"
						type="text" class="form-control" id="exampleInputPassword1"
						placeholder="city" value="${user.city}">
				</div>



				<div class="form-group">
					<label for="exampleInputPassword1">salary</label> <input
						name="salary" type="text" class="form-control"
						id="exampleInputPassword1" placeholder="salary" value="${user.salary}">
				</div>
				


				<div class="container text-center">
			<%-- 	 <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>  --%>
				 <a href="<%= request.getContextPath() %>/" class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Update</button>

				</div>




			</form>


		</div>
	</div>
	</div>

</body>
</html>