package login;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.login.UserValidation;

/**
 * The Class LoginTest.
 */
public class LoginTest {

	/** The action context. */
	private ActionContext actionContext;

	/** The user val. */
	private UserValidation userVal;

	/**
	 * Prepare for correct test.
	 */
	@Before
	public void prepareForCorrectTest() {

		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());

		userVal = Mockito.spy(new UserValidation());

		ActionContext.setContext(actionContext);

	}

	/**
	 * Finish the testing.
	 */
	@After
	public void finishTheTesting() {
		this.actionContext = null;
	}

	/**
	 * Test login function with good input.
	 */
	@Test
	public void testLoginFunctionWithGoodImputs() {

		String ret;

		userVal.setUsername("jaure");
		userVal.setPassword("123");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "acceptAdmin");

		userVal.setUsername("irati");
		userVal.setPassword("123");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "acceptAdmin");

		userVal.setUsername("reto");
		userVal.setPassword("123");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "acceptPeon");
	}

	/**
	 * Test login function with bad inputs.
	 */
	@Test
	public void testLoginFunctionWithBadImputs() {

		String ret;

		userVal.setUsername("");
		userVal.setPassword("123");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "deny");

		userVal.setUsername("ivbdvfof");
		userVal.setPassword("");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "deny");

		userVal.setUsername("");
		userVal.setPassword("");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "deny");

		userVal.setUsername("cihcbiwbhc");
		userVal.setPassword("svdnovns");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "deny");

		userVal.setUsername("qv9q98v4");
		userVal.setPassword("1qrv951ev923");
		ret = userVal.execute();
		assertEquals("The controller was not logged", ret, "deny");
	}

}
