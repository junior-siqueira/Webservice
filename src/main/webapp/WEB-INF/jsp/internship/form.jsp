<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkTo[InternshipController].insert()}" method="post">
		<label>status</label>
		<input type="text" name="internship.status">
		
		<label>Supervisor</label>
		<input type="number" name="internship.supervisor.id">
		
		<label>Trainee</label>
		<input type="number" name="internship.trainee.id">
		
		<label>Date Start</label>
		<input type="text" name="internship.dateStart">
		
		<label>Date Evaluation</label>
		<input type="text" name="internship.dateEvaluation">
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>