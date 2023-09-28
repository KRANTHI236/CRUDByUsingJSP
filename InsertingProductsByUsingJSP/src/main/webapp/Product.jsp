<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductDetails</title>
</head>
<body>
	<form action="productdata" method="post">

		<table>

			<tr>
				<td><label>PRODUCTNO </label></td>
				<td><input type="number" name="productno"
					placeholder="enter the pno"></td>
			</tr>
			<tr>
				<td><label>CODE </label></td>
				<td><input type="number" name="code"
					placeholder="enter the code"></td>
			</tr>
			<tr>
				<td><label>DESCRIPTION </label></td>
				<td><input type="text" name="description"
					placeholder="enter the desc"></td>
			</tr>
			<tr>
				<td><label>PRICE </label></td>
				<td><input type="number" name="price"
					placeholder="enter the price"></td>
			</tr>
			<tr>
				<td><label>CRTD_DT</label></td>
				<td><input type="number" name="crtd_dt"
					placeholder="enter the cdate"></td>
			</tr>
			<tr>
				<td><label>CRTD_BY</label></td>
				<td><input type="text" name="crtd_by"
					placeholder="enter the cby"></td>

			</tr>

			<tr>
				<td><button>SUBMIT</button></td>
			</tr>


		</table>





	</form>

</body>
</html>