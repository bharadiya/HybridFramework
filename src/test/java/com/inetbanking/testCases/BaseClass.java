package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig rc = new ReadConfig();
	public String baseurl = rc.getApplicationURL();
	public String username = rc.getUserName();
	public String password = rc.getPassword();
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",rc.getChropath());
		driver = new ChromeDriver();
		}
		else {
			System.err.println("Browser not found");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
