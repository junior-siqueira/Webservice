package br.edu.fjn.ws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.ws.components.UserSession;
import br.edu.fjn.ws.dao.UserDAO;
import br.edu.fjn.ws.model.User;

@Controller
@Path("/user")
public class UserController {
	
	@Inject
	private Result result;

	@Get("/form")
	public void form(){
		
	}
	
	@Get("/manager")
	public void manager(){
		
	}
	
	
	@Post("/insert")
	public void insert(User user){
		UserDAO userDAO = new UserDAO();
		userDAO.insert(user);
		result.redirectTo(this).form();
	}
	
}
