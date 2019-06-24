package com.inetbanking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import CSVFile.CSVFileReader;

public class AllDataProviders {
	@DataProvider(name = "testdataofUsernameandPassword")
	public Object[][] getExcelData() throws IOException {
		XLUtils p = new XLUtils(
				"/home/sb/eclipse-workspace/HybridFramework/src/test/java/com/inetbanking/testdata/UserandPassword.xlsx",
				"0");
		return p.fetchAllCellvalue();
	}
	
	@DataProvider(name="AddNewUsers")
	public Object[][] getCSVData() throws IOException{
		CSVFileReader c=new CSVFileReader("/home/sb/eclipse-workspace/HybridFramework/src/test/java/com/inetbanking/testdata/AddUsers.csv");
		return c.getDataFromCSV();
	}
}
