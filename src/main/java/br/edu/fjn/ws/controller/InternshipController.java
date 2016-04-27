package br.edu.fjn.ws.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;

@Controller
@Path("/internship")
public class InternshipController {

	@Inject
	private Result result;
	
	@Path("/index")
	public void index(){
		
	}
	
	@Post
	@Path("/insert")
	public void insert(Internship internship){
		InternshipDAO internshipDAO = new InternshipDAO();
		internshipDAO.insert(internship);
		System.out.println("Estágio inserido :D");
	}
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Internship> internship = InternshipDAO.listAll();
		result.use(Results.json()).from(internship, "internships").recursive().serialize();	
	}
	
	@Get
	@Path("search/{id}")
	public void search(Integer id){
		InternshipDAO dao = new InternshipDAO();
		List<Internship> internship = dao.searchInternshipBySuperv(id);
		result.use(Results.json()).from(internship, "internships").recursive().serialize();
	}
	
	@Get
	@Path("searchInternship/{id}")
	public void searchInternship(int id){
		InternshipDAO internshipDAO = new InternshipDAO();
		Internship internship = internshipDAO.searchId(id);
		internship.setStatus("0");
		internshipDAO.updateStatus(internship);
		result.use(Results.json()).from(internship, "internships").recursive().serialize();
	}
}
