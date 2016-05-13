package br.edu.fjn.ws.test;

import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.model.Supervisor;
import br.edu.fjn.ws.model.Trainee;
import br.edu.fjn.ws.model.User;

public class UserTest {
	public static void main(String[] args) {
		
		User user = new User();
		user.setUserName("Allen");
		user.setUserPassword("3333");
		
		Supervisor supervisor = new Supervisor();
		supervisor.setName("Allen");
		supervisor.setContact("allengomes@gmail.com");
		supervisor.setUser(user);
		
		Trainee trainee = new Trainee();
		trainee.setName("Gabilol");
		
		Internship internship = new Internship();
		internship.setTrainee(trainee);
		internship.setSupervisor(supervisor);
		internship.setDateStart(DateTest.saveDate().toString());
		internship.setDateEvalution("19/05/2016");
		internship.setStatus("0");
		
		InternshipDAO internshipDAO = new InternshipDAO();
		internshipDAO.insert(internship);
		
		//System.out.println("Inseri todos os dados! :D");
	}
}
