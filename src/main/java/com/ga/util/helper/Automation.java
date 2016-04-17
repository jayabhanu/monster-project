/**
 *   File Name: Automation.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 16, 2016
 *
 */

package com.ga.util.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Automation //ADDD (description of class)
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
public class Automation {
	public static boolean checkPageTitle(String url, String expectedPageTitle) {
		String actualPageTitle;
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		actualPageTitle = driver.getTitle();
		System.out.println("Actual:" + actualPageTitle);
		System.out.println("Expected:" + expectedPageTitle);
		if (actualPageTitle.equalsIgnoreCase(expectedPageTitle)) {
			return true;
		} else {
			return false;
		}

	}
}
