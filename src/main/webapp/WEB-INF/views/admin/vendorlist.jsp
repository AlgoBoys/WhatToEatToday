<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Vendor List For Admin</title>
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
		<h2>Vendor List</h2>
		<p>This is Admin Page - Click On Vendor Name</p>
		<div class="table-responsive">
			<table class="table table-striped table-hover table-users">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Description</th>
						<th>Location</th>
						<th>Is Active</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorlist}" var="vendor">
						<tr>
							<td>${vendor.vendId}</td>
							<td><a href="<c:url value='menulist/${vendor.vendId}' />">${vendor.vendName}
							</a></td>
							<td>${vendor.vendDescription}</td>
							<td>${vendor.dcModel.dcLocation}</td>
							<td>${vendor.isActive}</td>
							<td><a href="#vendor-modal" id="editVendor"
								data-toggle="modal" data-target="#myModal"><span
									class="glyphicon glyphicon-edit"> </span></a></td>
							<td><a href="#vendor-modal" id="editVendor"
								style="color: red" data-toggle="modal" data-target="#myModal"><span
									class="glyphicon glyphicon-remove"> </span></a></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>


		<!-- Modal -->
		<div id="myModal" class="modal fade" role="dialog">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Modal Header</h4>
					</div>
					<div class="modal-body">
						<p>Some text in the modal.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>