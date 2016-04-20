package br.edu.fjn.ws.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;

@Controller
@Path("/internship")
public class UserController {

	@Inject
	private Result result;
	
	@Path("/index")
	public void index(){
		
	}
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Internship> internship = InternshipDAO.listAll();
		result.use(Results.json()).from(internship, "internships").recursive().serialize();	
	}
	
	@Get
	@Path("search/{string}")
	public void search(String string){
		InternshipDAO dao = new InternshipDAO();
		List<Internship> internship = dao.search(string);
		result.use(Results.json()).from(internship, "internships").recursive().serialize();
	}
	
}
