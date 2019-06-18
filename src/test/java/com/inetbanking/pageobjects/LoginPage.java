package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "password")
	WebElement txtPassword;

	@FindBy(name = "uid")
	WebElement txtUserName;

	@FindBy(how = How.NAME, using = "btnLogin")
	WebElement btnLogin;

	@FindBy(how = How.LINK_TEXT, using = "Log out")
	WebElement logoutbtn;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void clickSubmit() {
		btnLogin.click();
	}

	public void loggingOut() {
		logoutbtn.click();
	}

}
/*
 * User Id:mngr201825 Pwd : YpapUbY Link : http://www.demo.guru99.com/V4/
 */