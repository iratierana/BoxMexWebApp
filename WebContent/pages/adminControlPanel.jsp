<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin</title>
	
	<link rel="shortcut icon" href="<s:url value="/img/boxMexIcon.png"/>"> 
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/bootstrap/css/bootstrap.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/creative.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/adminPanel.css"/>">
	<script src="<s:url value="/vendor/jquery/jquery.min.js"/>"></script>
</head>
<body>


	<div class="container">

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">
					<span class="glyphicon glyphicon-home"></span> IA Sistema Aukerak
				</h3>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class=" ">
						<a href="#" class="btn btn-danger btn-lg" role="button">
							<span class="glyphicon glyphicon-trash"></span> 
							<br/>IA algoritmoa ezarri
						</a>
						<a href="#" class="btn btn-warning btn-lg" role="button"><span
							class="glyphicon glyphicon-refresh"></span> <br />IA algoritmoa kendu</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">
					<span class="glyphicon glyphicon-home"></span> Biltegi kudeatzailea
				</h3>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class=" ">
						<a href="#" class="btn btn-danger btn-lg" role="button">
							<span class="glyphicon glyphicon-trash"></span> 
							<br/>Sistema gelditu
						</a>
						<a href="#" class="btn btn-warning btn-lg" role="button"><span
							class="glyphicon glyphicon-refresh"></span> <br />Sistema martxan ipini</a>
					</div>
				</div>
			</div>
		</div>

	</div>




</body>
</html>