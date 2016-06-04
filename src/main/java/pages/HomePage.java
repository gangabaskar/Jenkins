package pages;

import utils.Reporter;
import wrappers.ProjectWrappers;

public class HomePage extends ProjectWrappers{

	public HomePage verifySuccessMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.Success.Xpath"), data);
		return this;
	}
	


}
