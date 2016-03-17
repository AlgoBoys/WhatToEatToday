<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Vendor List</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h3>Vendor List</h3>
	<c:if test="${!empty vendorlist}">
		<table class="tg">
			<tr>
				<th width="120">Vendor Name - Click Here</th>
				<th width="120">Vendor Description</th>
				<th width="120">Vendor Location</th>
			</tr>
			<c:forEach items="${vendorlist}" var="vendor">
				<tr>
					<td align="right" bgcolor="lightgreen"><a
						href="<c:url value='menulist/${vendor.vendId}' />">${vendor.vendName}
					</a></td>
					<td>${vendor.vendDescription}</td>
					<td>${vendor.dcModel.dcLocation}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>