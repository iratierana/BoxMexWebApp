<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin</title>
	
	<link rel="shortcut icon" href="<s:url value="/img/boxMexIcon.png"/>"> 
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/font-awesome/css/font-awesome.min.css"/>">
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
						<span class="fa fa-plug"></span> Sarrera paketeak kudeatu
					</h3>
				</div>
				<div class="panel-body">
					<label >Aukeratu IA sistemara bidaltzeko paketea: </label>
					<form action="">
						<s:select list="idListPakeEntrada"	name="yourSearchEngine"	value="defaultSearchEngine" /><br>
						<button class="btn btn-md btn-success" type="submit">Ok</button>
					</form>
				</div>
			</div>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="fa fa-plug"></span> Irteera paketeak kudeatu
					</h3>
				</div>
				<div class="panel-body">
					<!--TODO -->
				</div>
			</div>
		</div>
</body>
</html>