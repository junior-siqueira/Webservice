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
		<input type="text" name="internship.status"><br>
		
		<label>Supervisor</label>
		<input type="text" name="internship.supervisor.id"><br>
		
		<label>Trainee</label>
		<input type="text" name="internship.trainee.id"><br>
		
		<label>Date Start</label>
		<input type="text" name="internship.dateStart"><br>
		
		<label>Date Evaluation</label>
		<input type="text" name="internship.dateEvaluation"><br>
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>