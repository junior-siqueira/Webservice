package br.edu.fjn.ws.components;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import br.edu.fjn.ws.model.User;

/*
 * 
 * @author Antonio Siqueira
 */

@SessionScoped
@Named("sessionUser")
public class UserSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3768559804565779075L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isLogged(){
		return user != null;
	}
	
	public void logout(){
		user = null;
	}
}
