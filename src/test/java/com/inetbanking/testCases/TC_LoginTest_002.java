package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.utilities.AllDataProviders;

import junit.framework.Assert;

public class TC_LoginTest_002 extends BaseClass{
	@Test(dataProvider = "testdataofUsernameandPassword",dataProviderClass = AllDataProviders.class)
	public void loginDDF(String uname,String pass) {
		driver.get(baseurl);
		LoginPage l=new LoginPage(driver);
		l.setUserName(uname);
		l.setPassword(pass);
		l.clickSubmit();
		if(isAlertPresent())
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
			l.loggingOut();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
