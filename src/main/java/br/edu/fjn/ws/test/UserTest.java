package br.edu.fjn.ws.test;

import br.edu.fjn.ws.dao.EvaluationDAO;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Evaluation;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.model.Supervisor;
import br.edu.fjn.ws.model.Trainee;
import br.edu.fjn.ws.model.User;
import br.edu.fjn.ws.resources.CompareDate;

public class UserTest {
	public static void main(String[] args) {
		
		/*User user = new User();
		user.setUserName("Sidney");
		user.setUserPassword("444");
		
		Supervisor supervisor = new Supervisor();
		supervisor.setName("Sidney");
		supervisor.setContact("sidneylima@gmail.com");
		supervisor.setUser(user);
		
		Trainee trainee = new Trainee();
		trainee.setName("Darlan Developer");
		
		Internship internship = new Internship();
		internship.setTrainee(trainee);
		internship.setSupervisor(supervisor);
		internship.setDateStart(DateTest.saveDate().toString());
		internship.setDateEvalution("19/05/2016");
		internship.setStatus("0");
		
		InternshipDAO internshipDAO = new InternshipDAO();
		internshipDAO.insert(internship);*/
		
		//System.out.println("Inseri todos os dados! :D");
		
		Trainee trainee = new Trainee();
		trainee.setId(2);
		Supervisor supervisor = new Supervisor();
		supervisor.setId(2);
		
		Evaluation evaluation = new Evaluation();
		evaluation.setTrainee(trainee);
		evaluation.setSupervisor(supervisor);
		evaluation.setDateEvaluation(CompareDate.saveDate().toString());
		evaluation.setDateResponse("19/05/2016");
		evaluation.setPersonalPresentation("Apresentação ruim");
		evaluation.setStatusPersonalPresentation(true);
		evaluation.setAssiduity("Não compareceu a todos os dias");
		evaluation.setStatusAssiduity(true);
		evaluation.setPunctuality("Só chega atrasado");
		evaluation.setStatusPunctuality(true);
		evaluation.setInitiative("Não tem iniciativa");
		evaluation.setStatusInitiative(true);
		evaluation.setInterpersonalRelationship("Relacionamento fraco");
		evaluation.setStatusInterpersonalRelationship(true);
		
		EvaluationDAO dao = new EvaluationDAO();
		dao.insert(evaluation);
		
		System.out.println("Dados inseridos com sucesso");
		System.out.println(evaluation.getTrainee().getId());
		System.out.println(trainee.getName());
	}
}
