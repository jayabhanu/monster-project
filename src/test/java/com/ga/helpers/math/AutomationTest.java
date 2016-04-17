package com.ga.helpers.math;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ga.util.helper.Automation;

public class AutomationTest {
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
				new Object[] { "http://amazon.com",
						"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" },
				new Object[] { "http://gmail.com", "Inbox (6,890) - gk.rajesh3@gmail.com - Gmail" } };
	}

	@Test(dataProvider = "dp")

	public void f(String url, String expectedPageTitle) {
		// String url ;
		// String expectedPageTitle ;
		boolean result = Automation.checkPageTitle(url, expectedPageTitle);
		Assert.assertTrue(result);
	}
}
