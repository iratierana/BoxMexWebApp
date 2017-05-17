package actions.sysGeldituMartx;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import entitys.system.Usuario;
import global.VariablesGlobales;

public class SystOnOff {
	
	public String onSystem(){
		VariablesGlobales.iaSistemaGeldiEdoMartxan = true;
		return checkLoggedUser();
	}
	
	public String offSystem(){
		VariablesGlobales.iaSistemaGeldiEdoMartxan = false;
		return checkLoggedUser();
	}
	
	
	
	private String checkLoggedUser(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		Usuario usuario = (Usuario) session.get("loggedUser");		
		return usuario.getTipoUsuario();
	}

}
