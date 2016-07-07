package br.edu.fjn.ws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.ws.dao.TraineeDAO;
import br.edu.fjn.ws.model.Trainee;

@Controller
@Path("/trainee")
public class TraineeController {

	public TraineeController() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	private Result result;

	@Get("/form")
	public void form(){
		
	}
	
	@Post("/insert")
	public void insert(Trainee trainee){
		TraineeDAO traineeDAO = new TraineeDAO();
		traineeDAO.insert(trainee);
		result.redirectTo(this).form();
	}
	
}
