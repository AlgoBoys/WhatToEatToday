<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Menu List For Vendor</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script>
	$(document)
			.ready(
					function() {

						$("button#submit1")
								.click(
										function() {

											var vendorName = $("#vendorName")
													.val();
											var vendorDiscription = $(
													"#vendorDiscription").val();
											var isActive = 'true';
											var vendorLocation = '3';

											var data = 'vendorName='
													+ vendorName
													+ '&vendorDiscription='
													+ vendorDiscription
													+ '&isActive=' + isActive
													+ '&vendorLocation='
													+ vendorLocation
											$
													.ajax({
														type : "POST",
														url : "http://localhost:8080/WhatToEatToday/admin/addvendor",
														data : data,
														success : function(data) {
															console
																	.log(
																			"SUCCESS: ",
																			data);
															alert(data);
														},
														error : function(e) {
															console.log(
																	"ERROR: ",
																	e);
															display(e);
															alert(e);
														},
														done : function(e) {
															console.log("DONE");
															alert(e);
														}
													});
										});
					});
</script>

</head>
<body>
	<div class="container">
		<h2>Vendor List</h2>
		<div class="container">
			<div class="row">
				<div class="col-md-6">Vendor Page to display List Of Menu.
					Vendor can Add / Edit/ Delete Menu.</div>
				<div class="col-md-5">
					<span class="pull-right"> <a href="#vendor-modal"
						id="editVendor" data-toggle="modal" data-target="#formContent">
							<button type="button" class="btn btn-info">Add New Menu</button>
					</a>
					</span>
				</div>
			</div>
		</div>
		<br />
		<div class="table-responsive">
			<table class="table table-striped table-hover table-users">
				<thead>
					<tr>
						<th></th>
						<th>Name</th>
						<th>Description</th>
						<th>Price</th>
						<th>Type</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${menulist}" var="menu">
						<tr>
							<td><a href="<c:url value='' />"><span
									class="glyphicon glyphicon-search"></span> </a></td>
							<td>${menu.menuName}</td>
							<td>${menu.menuDescription}</td>
							<td>${menu.menuprice}</td>
							<td>
								<c:if test="${menu.isLunch}">
									Lunch
								</c:if> 
								<c:if test="${not menu.isLunch}">
									Breakfast
								</c:if>
							</td>
							<td><a href="#vendor-modal" id="editVendor"
								data-toggle="modal" data-target="#formContent"><span
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
		<div id="formContent" class="modal fade" style="display: none;"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<!-- header -->
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Add/Edit Menu Details</h4>
					</div>
					<!-- body -->
					<div class="modal-body">

						<form class="vendor" role="form">
							<fieldset>
								<div class="form-group">
									<label class="col-sm-2 control-label" for="vendorName">Name</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="vendorName"
											name="vendorName" placeholder="Menu Name" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label" for="vendorDiscription">Description</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="vendorDiscription"
											name="vendorDiscription" placeholder="Menu Discription" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label" for="menuPrice">Price</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="vendorDiscription"
											name="vendorDiscription" placeholder="Menu Price" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label" for="isActive">Type</label>
									<div class="col-sm-10 dropdown">
										<button class="btn btn-default dropdown-toggle" type="button"
											data-toggle="dropdown">
											Food Type <span class="caret"></span>
										</button>
										<ul class="dropdown-menu">
											<li><a href="#">Lunch</a></li>
											<li><a href="#">Breakfast</a></li>
										</ul>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-success" data-dismiss="modal"
							id="submit">Submit</button>
						<a href="#" class="btn" data-dismiss="modal">Close</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>