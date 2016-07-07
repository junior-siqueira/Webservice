package br.edu.fjn.ws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.ws.dao.SupervisorDAO;
import br.edu.fjn.ws.model.Supervisor;

@Controller
@Path("/supervisor")
public class SupervisorController {

	public SupervisorController() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	private Result result;

	@Get("/form")
	public void form(){
		
	}
	
	@Post("/insert")
	public void insert(Supervisor supervisor){
		SupervisorDAO supervisorDAO = new SupervisorDAO();
		supervisorDAO.insert(supervisor);
		result.redirectTo(this).form();
	}
	
}
