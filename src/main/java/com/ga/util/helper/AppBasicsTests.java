/**
 *   File Name: AppBasicsTests.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.ga.util.helper;

import org.junit.*;

/**
 * AppBasicsTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasicsTests {
	static String appName = "Gajula Test";

	static String userName;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testfarwellUser() {
		AppBasics.farwellUser(userName, appName);
	}

	@Test
	public void testWelcomeUser() {
		userName = AppBasics.welcomeUserAndGetUserName("Gajula Test");
	}
}
