<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Menu List</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<h3>Menu List</h3>
	<c:if test="${!empty menulist}">
		<center>
			<table class="tg table"
				style="border-collapse: separate; border-spacing: 20px; border-width: 0px">
				<tr align="center">
					<th class="veg" bgcolor="#298A08"
						style="text-align: center; color: white">Veg Menu</th>
					<th class="nonveg" bgcolor="#FF0000"
						style="text-align: center; color: white">Non-veg Menu</th>
				</tr>
				<tr>
					<td>
						<table width="100%" style="border-width: 1px"
							class="table-striped table-hover table-users">
							<c:forEach items="${menulist}" var="menu">
								<c:if test="${menu.isVeg}">
									<tr>
										<td>
											<div>
												<div style="float: left; width: 80%;">
													<a
														href="<c:url value='../fooddescription/${menu.menuId}' />"><span
														class="glyphicon glyphicon-search"></span> </a> <strong>${menu.menuName}</strong>
												</div>
												<div align="center" style="float: right; width: 20%;">
													<span class="label label-success">&#x20B9;  ${menu.menuprice} </span>
												</div>
											</div> <br /> <br />
											<p>
												<font face="verdana">${menu.menuDescription}</font>
											</p>
										</td>
									</tr>
								</c:if>
							</c:forEach>
						</table>
					</td>
					<td valign="top">
						<table width="100%" style="border-width: 1px"
							class="table-striped table-hover table-users">
							<c:forEach items="${menulist}" var="menu">
								<c:if test="${not menu.isVeg}">
									<tr>
										<td>
											<div>
												<div style="float: left; width: 80%;">
													<a
														href="<c:url value='../fooddescription/${menu.menuId}' />"><span
														class="glyphicon glyphicon-search"></span> </a> <strong>${menu.menuName}</strong>
												</div>
												<div align="center" style="float: right; width: 20%;">
													<span class="label label-danger">&#x20B9; ${menu.menuprice} </span>
												</div>
											</div> <br /> <br />
											<p>
												<font face="verdana">${menu.menuDescription}</font>
											</p>
										</td>
									</tr>
								</c:if>
							</c:forEach>
						</table>
					</td>
				</tr>
			</table>
		</center>
	</c:if>
</body>
</html>