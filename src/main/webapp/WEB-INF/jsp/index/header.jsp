<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
<title>Página Inicial</title>
</head>
<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">

		<header class="mdl-layout__header">
			<div class="mdl-layout__header-row">
				<span class="mdl-layout-title">Fjn Estágios</span>
				<div class="mdl-layout-spacer"></div>
				Usuário Logado: ${userSession.user.userName}
				<button id="demo-menu-lower-right"
				        class="mdl-button mdl-js-button mdl-button--icon">
				  <i class="material-icons">arrow_drop_down</i>
				</button>
				
				<ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
				    for="demo-menu-lower-right">
				  <li class="mdl-menu__item">Gerenciar</li>
				  <li class="mdl-menu__item">Sair</li>
				  
				</ul>
			</div>
		</header>
		<div class="mdl-layout__drawer">
			<span class="mdl-layout-title">Navegação</span>
			<nav class="mdl-navigation">
				<a href="#" class="mdl-navigation__link">Link 1</a>
				<a href="#" class="mdl-navigation__link">Link 2</a>
				<a href="#" class="mdl-navigation__link">Link 3</a>
				<a href="#" class="mdl-navigation__link">Link 4</a>
			</nav>
		</div>
	
	
