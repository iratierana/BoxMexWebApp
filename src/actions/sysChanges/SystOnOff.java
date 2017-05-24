package actions.sysChanges;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import entitys.system.Usuario;
import varGlobal.VariablesGlobales;

/**
 * The Class SystOnOff.
 */
public class SystOnOff {

	/**
	 * Set all the system to on state.
	 *
	 * @return the string
	 */
	public String onSystem() {
		VariablesGlobales.sistemaOsoaGeldiEdoMartxan = true;
		return checkLoggedUser();
	}

	/**
	 * Sets all the system to off state.
	 *
	 * @return the string
	 */
	public String offSystem() {
		VariablesGlobales.sistemaOsoaGeldiEdoMartxan = false;
		return checkLoggedUser();
	}

	/**
	 * Check logged user.
	 *
	 * @return the string
	 */
	private String checkLoggedUser() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Usuario usuario = (Usuario) session.get("loggedUser");
		return usuario.getTipoUsuario();
	}

}
