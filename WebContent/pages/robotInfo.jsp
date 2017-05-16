<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Robot Info</title>
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/robotInfo.css"/>">
	<script src="<s:url value="/vendor/jquery/jquery.min.js"/>"></script>
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/bootstrap/css/bootstrap.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/creative.min.css"/>">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="well well-sm">
					<div class="row">
						<div class="col-sm-6 col-md-4">
							<img src="http://static4.businessinsider.com/image/56296350bd86ef14008c41a1-480/a-kiva-robot-moves-a-rack-of-merchandise-at-an-amazon-fulfillment-center-on-january-20-2015-in-tracy-california.jpg" alt=""
								class="img-rounded img-responsive" />
						</div>
							<div class="col-sm-6 col-md-8">
								<h4>Robot de <s:label name="robotIrtera.tipoRobot" ></s:label></h4>
							<p>
								<span>Robot id: <s:label name="robotIrtera.robotId" ></s:label></span><br>
								<span>Paquetes depositados: <s:label name="robotIrtera.paquetesDepositados" ></s:label></span><br>
								<span>Pertenece a almacen(id): <s:label name="robotIrtera.almacenId" ></s:label></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="well well-sm">
					<div class="row">
						<div class="col-sm-6 col-md-4">
							<img src="http://static4.businessinsider.com/image/56296350bd86ef14008c41a1-480/a-kiva-robot-moves-a-rack-of-merchandise-at-an-amazon-fulfillment-center-on-january-20-2015-in-tracy-california.jpg" alt=""
								class="img-rounded img-responsive" />
						</div>
							<div class="col-sm-6 col-md-8">
								<h4>Robot de <s:label name="robotSarrera.tipoRobot" ></s:label></h4>
							<p>
								<span>Robot id: <s:label name="robotSarrera.robotId" ></s:label></span><br>
								<span>Paquetes depositados: <s:label name="robotSarrera.paquetesDepositados" ></s:label></span><br>
								<span>Pertenece a almacen(id): <s:label name="robotSarrera.almacenId" ></s:label></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>