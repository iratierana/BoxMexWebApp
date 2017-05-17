package actions.sysChanges;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import entitys.system.Usuario;
import varGlobal.VariablesGlobales;

public class SystOnOff {
	
	public String onSystem(){
		VariablesGlobales.sistemaOsoaGeldiEdoMartxan = true;
		return checkLoggedUser();
	}
	
	public String offSystem(){
		VariablesGlobales.sistemaOsoaGeldiEdoMartxan = false;
		return checkLoggedUser();
	}
	
	
	
	private String checkLoggedUser(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		Usuario usuario = (Usuario) session.get("loggedUser");		
		return usuario.getTipoUsuario();
	}

}
