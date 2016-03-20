<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Food Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	// Load the Visualization API and the corechart package.
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});

	// Set a callback to run when the Google Visualization API is loaded.
	google.charts.setOnLoadCallback(drawChart);

	// Callback that creates and populates a data table,
	// instantiates the pie chart, passes in the data and
	// draws it.
	function drawChart() {

		// Create the data table.
		var data = new google.visualization.DataTable();
		data.addColumn('string', 'Topping');
		data.addColumn('number', 'Slices');
		data.addRows([ [ 'calories', 250 ], [ 'Fat', 120 ],
				[ 'carbohydrates', 80 ], [ 'protein', 90 ] ]);

		// Set chart options
		var options = {
			'title' : 'Nutritional Values of Food (in gram)',
			'width' : 400,
			'height' : 300
		};

		// Instantiate and draw our chart, passing in some options.
		var chart = new google.visualization.PieChart(document
				.getElementById('chart_div'));
		chart.draw(data, options);
	}
</script>
</head>
<body>
	<div class="container">
		<br />
		<div class="row">
			<div class="col-sm-10">
				<h2>${menuItem.menuName}</h2>
				<p>
					<span class="label label-default">&#x20B9;
						${menuItem.menuprice} </span> &nbsp;&nbsp;<font face="verdana">${menuItem.menuDescription}</font>
				</p>
			</div>
			<div class="col-sm-2">
				<br /> <br />
				<button type="button" class="btn btn-primary">Going to Eat</button>
			</div>
		</div>
		<br /> <br /> <br />
		<div class="row">
			<div class="col-sm-6">
				<div class="table-responsive">
					<table class="table table-striped table-hover table-users">
						<thead>
							<tr>
								<th>Ingredients</th>
								<th>Quantity (gram)</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${menuIngrediantsQuantityList}" var="miq">
								<tr>
									<td>${miq.ingrediantsModel.iFoodName}</td>
									<td>${miq.ingrediantAmouunt}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-sm-4">
				<img alt="Google Bar Chart" src=${pieUrl}>
			</div>
		</div>
	</div>
</body>
</html>