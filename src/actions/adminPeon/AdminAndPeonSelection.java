
package actions.adminPeon;

/**
 * The Class AdminAndPeonSelection.
 */
/**
 * @author Lazkano
 *
 */
/**
 * @author Lazkano
 *
 */
public class AdminAndPeonSelection {

	/**
	 * The buttons of the web page form.
	 */
	private String buttonName;

	/**
	 * Default action to divide the redirect page.
	 * @return It returns the page where we want to go
	 */
	public String execute() {
		switch (buttonName) {
		case "iaAlgoEzarri":
			break;

		case "iaAlgoKendu":
			break;

		case "sistemaGelditu":
			break;

		case "sistemaMartxJarri":
			break;

		case "robotXehetasunak":
			break;

		case "irteraHelmuga":
			break;
		default :
			break;

		}

		return "";
	}

	/**
	 * @return Returns the value of the button.
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * @param buttonName The name of the button to set the value.
	 */
	public void setButtonName(final String buttonName) {
		this.buttonName = buttonName;
	}

}
