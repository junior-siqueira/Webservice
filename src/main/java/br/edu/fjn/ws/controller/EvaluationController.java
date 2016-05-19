package br.edu.fjn.ws.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.edu.fjn.ws.dao.EvaluationDAO;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Evaluation;
import br.edu.fjn.ws.model.Internship;

@Controller
@Path("/evaluation")
public class EvaluationController {

	@Inject
	private Result result;
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Evaluation> evaluation = EvaluationDAO.listAll();
		result.use(Results.json()).from(evaluation, "evaluation").recursive().serialize();	
	}
	
}
