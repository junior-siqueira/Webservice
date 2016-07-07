package br.edu.fjn.ws.controller;

import java.lang.ProcessBuilder.Redirect;
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
	
	public InternshipController() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	private Result result;
	

	@Get("/form")
	public void form(){
		
	}
	
	@Post
	public void insert(Internship internship){
		try {
			InternshipDAO internshipDAO = new InternshipDAO();
			internshipDAO.insert(internship);
			System.out.println("Estágio inserido :D");
			result.redirectTo(this).form();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Internship> internship = InternshipDAO.listAll();
		result.use(Results.json()).from(internship, "internship").recursive().serialize();	
	}
	
	@Get
	@Path("search/{id}")
	public void search(Integer id){
		InternshipDAO dao = new InternshipDAO();
		List<Internship> internship = dao.searchInternshipBySuperv(id);
		result.use(Results.json()).from(internship, "internship").recursive().serialize();
	}
	
	@Get
	@Path("/listStatus")
	public void listStatus(){
		ArrayList<Internship> in = InternshipDAO.listStatusEvaluation();
		result.use(Results.json()).from(in, "internship").exclude("dateStart","status",
		"supervisor.contact","supervisor.user","supervisor.name").recursive().serialize();	
	}
	
	@Get
	@Path("list/{id}")
	public void list(int id){
		InternshipDAO internshipDAO = new InternshipDAO();
		result.use(Results.json()).from(internshipDAO.listSupervStatus(id), "internship").exclude("dateStart","status",
				"supervisor.contact","supervisor.user","supervisor.name").recursive().serialize();
		System.out.println(internshipDAO.listSupervStatus(id).size());
	}
	
	
	
	@Get
	@Path("searchInternship/{id}")
	public void searchInternship(int id){
		InternshipDAO internshipDAO = new InternshipDAO();
		Internship internship = internshipDAO.searchId(id);
		internship.setStatus("0");
		internshipDAO.updateStatus(internship);
		//result.use(Results.json()).from(internship, "internship").recursive().serialize();
	}
}
