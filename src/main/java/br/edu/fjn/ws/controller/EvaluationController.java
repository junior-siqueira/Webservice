package br.edu.fjn.ws.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.serialization.Deserializes;
import br.com.caelum.vraptor.serialization.gson.WithoutRoot;
import br.com.caelum.vraptor.view.Results;
import br.edu.fjn.ws.dao.EvaluationDAO;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Evaluation;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.resources.CompareDate;

@Controller
@Path("/evaluation")
public class EvaluationController {
	
	public EvaluationController() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	private Result result;
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Evaluation> evaluation = EvaluationDAO.listAll();
		result.use(Results.json()).from(evaluation, "evaluation").recursive().serialize();
	}
	
	@Post("/salvar")
	public void insert(Evaluation evaluation){
		EvaluationDAO dao = new EvaluationDAO();
		evaluation.setDateResponse(CompareDate.saveDate());
		dao.insert(evaluation);
		InternshipController internshipController = new InternshipController();
		int idTrainee = Integer.parseInt(evaluation.getTrainee().toString());
		internshipController.searchInternship(idTrainee);
		result.use(Results.json()).from("OK").serialize();
	}
	
}
