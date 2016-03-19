<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Vendor List For Your DC</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Vendor List For Your DC</h2>
		
		<div class="table-responsive">
			<table class="table table-striped table-hover table-users">
				<thead>
					<tr>
						<th></th>
						<th>ID</th>
						<th>Name</th>
						<th>Description</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorlist}" var="vendor">
						<tr>
							<td><a href="<c:url value='../menulist/${vendor.vendId}' />"><span
									class="glyphicon glyphicon-search"></span> </a></td>
							<td>${vendor.vendId}</td>
							<td>${vendor.vendName}
							</td>
							<td>${vendor.vendDescription}</td>
							

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>


		
	</div>
</body>
</html>