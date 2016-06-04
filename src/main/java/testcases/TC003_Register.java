package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_Register extends ProjectWrappers{
	
	@Test(dataProvider="fetchData")
	public void SignUp(String firstName, String lastName, String email, String password) {

		new LoginPage()
		.clickSignUp()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterUserName(email)
		.enterPassword(password)
		.clickSubmit();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Register to Web Store";
		testDescription="Register to Web Store using POM";
	}

}
