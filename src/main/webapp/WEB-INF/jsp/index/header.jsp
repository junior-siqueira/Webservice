<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.indigo-blue.min.css" />
<script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
<title>Página Inicial</title>
<style type="text/css">
	.mdl-navigation__link .material-icons{
		margin-right: 25px;
	}
</style>
</head>
<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">

		<header class="mdl-layout__header">
			<div class="mdl-layout__header-row">
				<span class="mdl-layout-title">Fjn Estágios</span>
				<div class="mdl-layout-spacer"></div>
				Usuário Logado: ${sessionUser.user.userName}
				<button id="demo-menu-lower-right"
				        class="mdl-button mdl-js-button mdl-button--icon">
				  <i class="material-icons">arrow_drop_down</i>
				</button>
				
				<ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
				    for="demo-menu-lower-right">
				  <a href="${linkTo[UserController].manager()}" class="mdl-menu__item">Gerenciar</a>
				  <a href="${linkTo[LoginController].logout()}" class="mdl-menu__item">Sair</a>
				  
				</ul>
			</div>
		</header>
		<div class="mdl-layout__drawer">
			<span class="mdl-layout-title">Menu</span>
			<nav class="mdl-navigation">
				<a href="#" class="mdl-navigation__link"><i class="material-icons">home</i>Home</a>
				<a href="#" class="mdl-navigation__link"><i class="material-icons">content_paste</i>Estágios</a>
				<a href="#" class="mdl-navigation__link"><i class="material-icons">people</i>Estagiários</a>
				<a href="#" class="mdl-navigation__link"><i class="material-icons">person</i>Usuário</a>
				<a href="#" class="mdl-navigation__link"><i class="material-icons">settings</i>Configurações</a>
			</nav>
		</div>
	
	
