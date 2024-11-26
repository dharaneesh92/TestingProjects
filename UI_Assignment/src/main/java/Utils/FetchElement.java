package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseTest;

public class FetchElement {
	
	public WebElement getWebElement(String identifierType, String IdentifierValue) {
		switch(identifierType) {
			
			case "XPATH":
			    return BaseTest.driver.findElement(By.xpath(IdentifierValue));
			case "CSS":
				return BaseTest.driver.findElement(By.cssSelector(IdentifierValue));
			case "ID":
			    return BaseTest.driver.findElement(By.id(IdentifierValue));	
			case "NAME":
			    return BaseTest.driver.findElement(By.name(IdentifierValue));
			case "TAGNAME":
			    return BaseTest.driver.findElement(By.tagName(IdentifierValue));
			case "LINKTEXT":
				return BaseTest.driver.findElement(By.linkText(IdentifierValue));
			case "PARTIALLINKTEXT":
				return BaseTest.driver.findElement(By.partialLinkText(IdentifierValue));
			default:
				return null;
		}
	}
	
	public List<WebElement> getWebElements(String identifierType, String IdentifierValue) {
		switch(identifierType) {
			
			case "XPATH":
			    return BaseTest.driver.findElements(By.xpath(IdentifierValue));
			case "CSS":
				return BaseTest.driver.findElements(By.cssSelector(IdentifierValue));
			case "ID":
			    return BaseTest.driver.findElements(By.id(IdentifierValue));	
			case "NAME":
			    return BaseTest.driver.findElements(By.name(IdentifierValue));
			case "TAGNAME":
			    return BaseTest.driver.findElements(By.tagName(IdentifierValue));
			case "LINKTEXT":
				return BaseTest.driver.findElements(By.linkText(IdentifierValue));
			case "PARTIALLINKTEXT":
				return BaseTest.driver.findElements(By.partialLinkText(IdentifierValue));
			default:
				return null;
		}
	}

}
