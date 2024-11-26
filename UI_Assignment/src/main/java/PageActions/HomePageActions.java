package PageActions;

import org.testng.Assert;

import PageObjects.HomePageElements;
import Utils.FetchElement;

public class HomePageActions {

	FetchElement element=new FetchElement();
	public void revenueCalculatorClick() {
		Assert.assertTrue(element.getWebElement("XPATH", HomePageElements.revenueCalculatorElement).isDisplayed(), "Element Not Found");
		element.getWebElement("XPATH", HomePageElements.revenueCalculatorElement).click();
	}
	public void verifyHomePageElemnts() {
		Assert.assertTrue(element.getWebElements("XPATH", HomePageElements.revenueCalculatorElement).size()>0, "No Element Found");
	}
}
