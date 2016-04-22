package br.edu.fjn.ws.test;

import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.model.Supervisor;
import br.edu.fjn.ws.model.Trainee;
import br.edu.fjn.ws.model.User;

public class UserTest {
	public static void main(String[] args) {
		
		User user = new User();
		user.setUserName("Sidney");
		user.setUserPassword("111111");
		
		Supervisor supervisor = new Supervisor();
		supervisor.setName("Sidney");
		supervisor.setContact("sidneylima@gmail.com");
		supervisor.setUser(user);
		
		Trainee trainee = new Trainee();
		trainee.setName("Quesado Wins");
		
		Internship internship = new Internship();
		internship.setTrainee(trainee);
		internship.setSupervisor(supervisor);
		internship.setStatus("1");
		
		InternshipDAO internshipDAO = new InternshipDAO();
		internshipDAO.insert(internship);
		
		//System.out.println("Inseri todos os dados! :D");
	}
}
