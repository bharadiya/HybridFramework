package com.inetbanking.testCases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.AddCustomerPage;
import com.inetbanking.utilities.AllDataProviders;

public class TC_3 extends BaseClass {
	@Test(dataProvider = "AddNewUsers", dataProviderClass = AllDataProviders.class)
	public void AddUser(String... a) throws InterruptedException {
		System.out.println(Arrays.deepToString(a));
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("New Customer")).click();
//		Thread.sleep(3000);
//		AddCustomerPage addcust = new AddCustomerPage(driver);
//		addcust.custName(a[0]);
//		addcust.custgender(a[1]);
//		addcust.custdob(a[2], a[3], a[4]);
//		Thread.sleep(5000);
//		addcust.custaddress(a[5]);
//		addcust.custcity(a[6]);
//		addcust.custstate(a[7]);
//		addcust.custpinno(a[8]);
//		addcust.custtelephoneno(a[9]);
//		addcust.custemailid(a[10]);
//		addcust.custpassword(a[11]);
//		addcust.custsubmit();
//		Thread.sleep(3000);
	}
}
