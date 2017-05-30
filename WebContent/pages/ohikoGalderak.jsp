<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Ohiko Galderak</title>
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/font-awesome/css/font-awesome.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/bootstrap/css/bootstrap.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/ohikoGalderak.css"/>">

</head>
<body>
	<div class="container">
		<div class="panel-group" id="accordion">
			<div class="faqHeader">General questions</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">Nola hasi dezaket neure sesioa?</a>
					</h4>
				</div>
				<div id="collapseOne" class="panel-collapse collapse in">
					<div class="panel-body">
						Zerbitzua erosi baldin baduzu:
						<ul>
							<li>Web gunera joan</li>
							<li>Sartu zure bazkide izena</li>
							<li>Sartu zure pasahitza</li>
						</ul>
						Ez baduzu zerbitzua erosi:
						<ul>
							<li>Deitu enpresako telefonora (behean daukazu).</li>
							<li>Jarraitu langilearen instrukzioak</li>
							<li>Zerbitzua erosi ondoren jarraitu galdera honen goiko pausoak (Zerbitzua erosi baldin baduzu)</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTen">Nola erosi dezaket zerbitzua?</a>
					</h4>
				</div>
				<div id="collapseTen" class="panel-collapse collapse">
					<div class="panel-body">
						 <ul>
							<li>Deitu enpresako telefonora (behean daukazu).</li>
							<li>Jarraitu langilearen instrukzioak</li>
							<li>Zerbitzua erosi ondoren jarraitu galdera honen goiko pausoak (Zerbitzua erosi baldin baduzu)</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseEleven">Nik erosi behar ditut robotak?</a>
					</h4>
				</div>
				<div id="collapseEleven" class="panel-collapse collapse">
					<div class="panel-body">
						Bai. Biltegian erabili behar dituzun robotak NFC txipas irakurtzeko gaitasuna izan behar dute.
					</div>
				</div>
			</div>

			<div class="faqHeader">Sellers</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">Nik erosi behar ditut NFC txipak?</a>
					</h4>
				</div>
				<div id="collapseTwo" class="panel-collapse collapse">
					<div class="panel-body">
						Ez. Zerbitzua erosterakoan biltegiaren diseinua eman behar da. Diseinu hau kontuan edukita guk erabakitzen dugu txipak non jarri beharko diren. Zerbitzua kontratatzerakoan, pausoetako bat hitzordu bat erabakitzea da, egun horretan gure teknikari bat joando da zure biltegira txipak jarri eta konfiguratzeko.
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>