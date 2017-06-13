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
		VariablesGlobales.setIaSistemaOnOff(true);
		return "ok";
	}

	/**
	 * Set the IA system off.
	 *
	 * @return off value
	 */
	public String iaOff() {
		VariablesGlobales.setIaSistemaOnOff(false);
		return "ok";
	}

}
