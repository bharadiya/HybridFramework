package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.utilities.AllDataProviders;

import junit.framework.Assert;

public class TC_LoginTest_002 extends BaseClass {
	@Test(dataProvider = "testdataofUsernameandPassword", dataProviderClass = AllDataProviders.class)
	public void loginDDF(String []a) throws InterruptedException {
		driver.get(baseurl);
		LoginPage l = new LoginPage(driver);
		l.setUserName(a[0]);
		l.setPassword(a[1]);
		l.clickSubmit();
		if (isAlertPresent()) {
			// Log in fail condition
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		} else {
			// Log in pass condition
			Assert.assertTrue(true);
			l.loggingOut();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
//			Thread.sleep(3000);
//			driver.findElement(By.linkText("New Customer")).click();
//			Thread.sleep(3000);
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
