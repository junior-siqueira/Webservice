package br.edu.fjn.ws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.ws.components.UserSession;

@Controller
public class IndexController {

	@Inject
	private UserSession userSession;
	
	@Inject
	private Result result;
	
	@Get("/index")
	public void index(){
		result.include("userSession", userSession);
	}
}
