package actions.sysChanges;

import varGlobal.VariablesGlobales;

/**
 * The Class IAOnOff.
 */
public class IAOnOff {

	/**
	 * Set the IA system on.
	 *
	 * @return on value
	 */
	public String iaOn() {
		VariablesGlobales.iaSistemaOnOff = true;
		return "ok";
	}

	/**
	 * Set the IA system off.
	 *
	 * @return off value
	 */
	public String iaOff() {
		VariablesGlobales.iaSistemaOnOff = false;
		return "ok";
	}

}
