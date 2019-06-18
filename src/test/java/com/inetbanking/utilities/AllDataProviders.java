package com.inetbanking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class AllDataProviders {
	@DataProvider(name = "testdataofUsernameandPassword")
	public Object[][] getExcelData() throws IOException {
		XLUtils p = new XLUtils(
				"/home/sb/eclipse-workspace/HybridFramework/src/test/java/com/inetbanking/testdata/UserandPassword.xlsx",
				"0");
		return p.fetchAllCellvalue();
	}
}
