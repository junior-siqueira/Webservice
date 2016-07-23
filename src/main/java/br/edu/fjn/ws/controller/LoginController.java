package br.edu.fjn.ws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.ws.components.UserSession;
import br.edu.fjn.ws.dao.LoginDao;
import br.edu.fjn.ws.model.User;

@Controller
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	private Result result;
	
	@Inject
	private UserSession userSession;
	
	
	@Get("/")
	public void form(){
		
	}
	
	@Post("login")
	public void login(User user){
		if(user.getUserName() != null && user.getUserPassword() != null){
			LoginDao loginDao = new LoginDao();
			if(loginDao.validateLogin(user.getUserName(), user.getUserPassword())){
				userSession.setUser(user);
				result.redirectTo(IndexController.class).index();
			}else{
				result.include("message", "Usuário ou senha inválidos");
				result.redirectTo(this).form();
				
			}
		}else{
			result.include("message", "Preencha os Campos");
			result.redirectTo(this).form();
		}
	}
		
	@Get("logout")
	public void logout(){
		userSession.logout();
		result.redirectTo(LoginController.class).form();
	}
}
