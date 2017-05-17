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
						<span class="fa fa-plug"></span> IA Sistema Aukerak
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="iaAlgoEzarri" name="buttonName"> 
							<span class="fa fa-plus-square-o"></span> <br />IA algoritmoa ezarri
						</button> 
						<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="iaAlgoKendu" name="buttonName">
							<span class="fa fa-trash-o"></span> <br />IA algoritmoa kendu
						</button>	
					</div>
				</div>
			</div>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="glyphicon glyphicon-home"></span> Biltegia
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<form action="sysOff">
							<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="sistemaGelditu" name="buttonName">
								<span class="fa fa-pause"></span> <br />Sistema gelditu
							</button> 
						</form>
						<form action="sysOn">
							<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="sistemaMartxJarri" name="buttonName">
								<span class="fa fa-forward"></span> <br />Sistema martxan ipini
							</button>	
						</form>	
					</div>
				</div>
			</div>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="fa fa-cog"></span> Biltegi kudeaketa
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<form action="robotInfoIkusi">
							<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="robotXehetasunak" name="buttonName">
							<span class="fa fa-info-circle"></span> <br />Robotaren xehetasunak
							</button>
						</form>						 
						<form action="redirectPaketeKudeaketa">
							<button class="btn btn-default btn-sm btn-block btn-lg" type="submit" value="irteraHelmuga" name="buttonName"> 
								<span class="fa fa-wrench"></span> <br />Pakete kudeaketa
							</button>	
						</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>