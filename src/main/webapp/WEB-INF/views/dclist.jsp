<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>DC List</title>
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
	<h3>DC List</h3>
	<c:if test="${!empty dclist}">
		<table class="tg">
			<tr>
				<th width="120">DC Name</th>
				<th width="120">DC Location</th>
				<th width="60">Image</th>
			</tr>
			<c:forEach items="${dclist}" var="dc">
				<tr>
					<td>${dc.dc_Name}</td>
					<td>${dc.dc_Location}</td>
					<td>${dc.dc_image_url}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>