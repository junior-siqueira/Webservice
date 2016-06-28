package br.edu.fjn.ws.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.serialization.gson.WithoutRoot;
import br.com.caelum.vraptor.view.Results;
import br.edu.fjn.ws.dao.EvaluationDAO;
import br.edu.fjn.ws.dao.TestandoDAO;
import br.edu.fjn.ws.model.Evaluation;
import br.edu.fjn.ws.model.Testando;

@Controller
@Path("/testando")
public class TestandoController {

	public TestandoController() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	private Result result;
	
	@Get
	@Path("/listAll")
	public void listAll(){
		ArrayList<Testando> testando = TestandoDAO.listAll();
		result.use(Results.json()).from(testando, "testando").recursive().serialize();	
	}
	
	
	@Consumes(value = "application/json", options = WithoutRoot.class)
	@Post("/salvar")
	public void insert(Testando testando){
		System.out.println("=======================================Chama o método");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(testando.getNome());
		System.out.println();
		System.out.println();
		TestandoDAO dao = new TestandoDAO();
		dao.insert(testando);
		result.use(Results.json()).from("sucesso").serialize();
	}

}
