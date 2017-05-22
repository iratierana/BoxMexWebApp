package actions.login;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import DAO.UserDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Usuario;

/**
 * The Class UserValidation.
 */
public class UserValidation {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/** The username. */
	String username;

	/** The password. */
	String password;

	/** The return value. */
	String returnValue = "deny";

	/**
	 * Define which kind of user has been logged in.
	 *
	 * @return the type of user logged in
	 */
	public String execute() {

		Map<String, Object> session = ActionContext.getContext().getSession();
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexshareduser", "1234");
		Usuario user = UserDAO.comprobarUsuarioEnDB(username, password);
		DatabaseConnect.disconnectFromTheDatabase();

		if (user != null) {
			session.put("loggedUser", user);
			switch (user.getTipoUsuario()) {
			case "A":
				DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
				returnValue = "acceptAdmin";
				break;

			case "P":
				DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexpeon", "1234");
				returnValue = "acceptPeon";
				break;
			default:
				returnValue = null;
				break;
			}
		}
		return returnValue;

	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

}
