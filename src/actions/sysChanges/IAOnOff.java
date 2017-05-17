package actions.sysChanges;

import varGlobal.VariablesGlobales;

public class IAOnOff {
	
	public String iaOn(){
		VariablesGlobales.isSistemaOsoaGeldiEdoMartxan = true;
		return "ok";
	}
	
	public String iaOff(){
		VariablesGlobales.isSistemaOsoaGeldiEdoMartxan = false;
		return "ok";
	}

}
