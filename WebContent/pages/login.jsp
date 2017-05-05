<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="shortcut icon" href="<s:url value="/img/boxMexIcon.png"/>">  
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/login.css"/>">
</head>
<body>
	    <div class="container">
        <div class="card card-container">
            <img id="profile-img" class="profile-img-card" src="<s:url value="/img/boxMexIcon.png"/>" />
            <p id="profile-name" class="profile-name-card"></p>
            <form action="userAuthentication" class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" name="username" id="inputEmail" class="form-control" placeholder="Usuario" required autofocus>
                <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Contraseña" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Recordarme
                    </label>
                </div>
                <button class="btn btn-lg btn-success btn-block btn-signin" type="submit">Iniciar Sesión</button>
            </form>
        </div>
    </div>
</body>
</html>