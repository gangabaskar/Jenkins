package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

import org.testng.annotations.BeforeClass;

public class TC001_LoginSuccess extends ProjectWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifySuccessMessage("You are successfully logged out");

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to Web Store";
		testDescription="Login and Logout in Web Store using POM";
	}

	
	
	
	
	
	
}
