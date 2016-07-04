<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkTo[EvaluationController].insert()}" method="post">
		
		<label>Trainee</label>
		<input type="text" name="evaluation.trainee"><br>
		
		<label>Supervisor</label>
		<input type="text" name="evaluation.supervisor"><br>
		
		<label>Date Evaluation</label>
		<input type="text" name="evaluation.dateEvaluation"><br>
		
		<label>Date Response</label>
		<input type="text" name="evaluation.dateResponse"><br>
		
		<label>Personal Presentation</label>
		<input type="text" name="evaluation.personalPresentation"><br>
		
		<label>Status</label>
		<input type="text" name="evaluation.statusPersonalPresentation"><br>
		
		<label>Assiduity</label>
		<input type="text" name="evaluation.assiduity"><br>
		
		<label>Status</label>
		<input type="text" name="evaluation.statusAssiduity"><br>
		
		<label>Punctuality</label>
		<input type="text" name="evaluation.punctuality"><br>
		
		<label>Status</label>
		<input type="text" name="evaluation.statusPunctuality"><br>
		
		<label>Initiative</label>
		<input type="text" name="evaluation.initiative"><br>
		
		<label>Status</label>
		<input type="text" name="evaluation.statusInitiative"><br>
		
		<label>Interpersonal Relationship</label>
		<input type="text" name="evaluation.interpersonalRelationship"><br>
		
		<label>Status</label>
		<input type="text" name="evaluation.statusInterpersonalRelationship"><br>
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>