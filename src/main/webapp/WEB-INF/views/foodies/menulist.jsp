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
	border-width: 1 px;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tablehead {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 0px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.veg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #FFFFFF;
	background-color: green;
}

.nonveg {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #FFFFFF;
	background-color: #FF0000;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h3>DC List</h3>
	<c:if test="${!empty menulist}">
		<table class="tg"
			style="border-collapse: separate; border-spacing: 20px; border-width: 0px">
			<tr>
				<th class="veg" bgcolor="#298A08">vegetarian</th>
				<th class="nonveg" bgcolor="#FF0000">Non vegetarian</th>
			</tr>
			<tr>
				<td>
					<table style="border-width: 1px">
						<c:forEach items="${menulist}" var="menu">
							<c:if test="${menu.isVeg}">
								<tr>
									<td>
										<div>
											<div style="float: left; width: 80%;">
												<strong>${menu.menuName}</strong>
											</div>
											<div align="center"
												style="float: right; width: 10%; background-color: #298A08; color: white">
												${menu.menuprice}</div>
										</div> <br />
										<p>
											<font face="verdana">${menu.menuDescription}</font>
										</p>
									</td>
								</tr>
							</c:if>
						</c:forEach>
					</table>
				</td>
				<td>
					<table style="border-width: 1px">
						<c:forEach items="${menulist}" var="menu">
							<c:if test="${not menu.isVeg}">
								<tr>
									<td>
										<div>
											<div style="float: left; width: 80%;">
												<strong>Chicken Masala</strong>
											</div>
											<div align="center"
												style="float: right; width: 10%; background-color: #FF0000; color: white">90</div>
										</div> <br />
										<p>
											<font face="verdana">1 Blowl Chicken Masala, 3 Tandori
												Roti, Green Salad</font>
										</p>
									</td>
								</tr>
							</c:if>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</c:if>
</body>
</html>