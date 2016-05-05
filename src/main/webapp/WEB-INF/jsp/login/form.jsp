<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Webservice</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
<style type="text/css">
	* div,h5,h3,button{
  font-family: cursive !important;
}
body{
    background: #297bbb;
}
.corpo{
	margin-top: 200px;
}
.login-form-div{
	width: 500px;
	background: #fff;
}
.form-column{
  padding: 20px 35px !important;  
}
.cell_con{
	background: #fff;
	padding-left: 20px;
}
.cell_con div{
	width: 87%;
}
.links{
	margin: auto;
	text-align: center;
}
.btn{
  margin:auto; 
  width:100%;
}
</style>
</head>
<body>	
	<form action="${linkTo[LoginController].login}" role="form" method="post">
		<div class="mdl-layout mdl-layout--fixed-header mdl-js-layout  mdl-color--white-100 corpo">
		<main class="mdl-layout__content main_content">
			<div class="login-form-div mdl-grid mdl-shadow--8dp">
			<strong>Login</strong>
				<div class="mdl-cell mdl-cell--12-col cell_con">
					<i class="material-icons">person</i>
					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
						<input class="mdl-textfield__input" type="text" name="user.userName">
						<label class="mdl-textfield__label" for="userName">Enter User</label>
			        </div>
				</div>				
				<div class="mdl-cell mdl-cell--12-col cell_con">
					<i class="material-icons">lock</i>
					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
						<input class="mdl-textfield__input" type="password" name="user.userPassword">
						<label class="mdl-textfield__label" for="userPassword">Enter Password</label>
			        </div>
				</div>				
				<div class="mdl-cell mdl-cell--12-col  login-btn-con">
					<button type="submit" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--primary btn">Login</button>
				</div>
				<span style="color: red;">${message} </span>
			</div>
	    </main>
    </div>	
	</form>
</body>
</html>