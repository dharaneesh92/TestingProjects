package PageActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.BaseTest;
import PageObjects.ReturnCalcPageElements;
import Utils.FetchElement;

public class ReturnCalcPageActions {
	FetchElement element=new FetchElement();
	WebDriverWait wait=new WebDriverWait(BaseTest.driver,Duration.ofSeconds(5));
	
	public void verifyReturncalcPageHeader() {
		wait.until(ExpectedConditions.visibilityOfAllElements(element.getWebElements("XPATH",ReturnCalcPageElements.returnCalcPageHeader)));
		Assert.assertTrue(element.getWebElements("XPATH", ReturnCalcPageElements.returnCalcPageHeader).size()>0, "No Elements Found");
	}
	
	public void slideToPoint(int targetValue) throws InterruptedException {
		wait.until((ExpectedConditions.visibilityOf(element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement))));
		JavascriptExecutor js=(JavascriptExecutor)BaseTest.driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement));
		wait.until(ExpectedConditions.elementToBeClickable(element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement)));
	    int currentValue = Integer.parseInt(element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement).getAttribute("value"));
	    int difference = targetValue - currentValue;
	    for (int i = 0; i < Math.abs(difference); i++) {
	        if (difference > 0) {
	        	element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement).sendKeys(Keys.ARROW_RIGHT); // Increment slider
	        } else {
	        	element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement).sendKeys(Keys.ARROW_LEFT); // Decrement slider
	        }
	    }
		BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    int revenue=Integer.parseInt(element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue).getAttribute("value"));
	    System.out.println("Slider Value: "+revenue);
	    Assert.assertTrue(revenue==targetValue,"Slider Value is Mismatching");
	    
	}
	
	public void textUpdateSlider(int value) throws InterruptedException {
		wait.until((ExpectedConditions.visibilityOf(element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement))));
		JavascriptExecutor js=(JavascriptExecutor)BaseTest.driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element.getWebElement("XPATH",ReturnCalcPageElements.sliderElement));
		wait.until(ExpectedConditions.elementToBeClickable(element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue)));
		element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue).clear();
   		js.executeScript("arguments[0].value = arguments[1];", element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue),value);
	    js.executeScript("arguments[0].dispatchEvent(new Event('change'));", element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue));
		wait.until(ExpectedConditions.attributeToBe(element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue), "value", String.valueOf(value)));
		int sliderValue=Integer.parseInt(element.getWebElement("XPATH", ReturnCalcPageElements.sliderInputValue).getAttribute("value"));
		System.out.println("sliderValue Updated: "+sliderValue);
		Assert.assertTrue(sliderValue==value, "Slider is defective");
		
	}
	 public void selectCPTCodes() throws InterruptedException {
		 wait.until((ExpectedConditions.visibilityOf(element.getWebElement("XPATH",ReturnCalcPageElements.cptCodeCollection))));
			JavascriptExecutor js=(JavascriptExecutor)BaseTest.driver;
			js.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element.getWebElement("XPATH",ReturnCalcPageElements.cptCodeCollection));
			element.getWebElement("XPATH",ReturnCalcPageElements.cptCodeCollection).click();
			wait.until(ExpectedConditions.elementToBeClickable(element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeMonitoring)));
			element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeMonitoring).click();
			wait.until(ExpectedConditions.elementToBeClickable(element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeReimbursemnent)));
			element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeReimbursemnent).click();
			wait.until(ExpectedConditions.elementToBeClickable(element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeReadings)));
			element.getWebElement("XPATH", ReturnCalcPageElements.cptCodeReadings).click();
			
	 }
	 public void validateReimbursement(int value) throws InterruptedException {
		 wait.until((ExpectedConditions.visibilityOf(element.getWebElement("XPATH",ReturnCalcPageElements.totalRecurringReimbursement))));
			JavascriptExecutor js=(JavascriptExecutor)BaseTest.driver;
			js.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element.getWebElement("XPATH",ReturnCalcPageElements.totalRecurringReimbursement));
			Thread.sleep(5000);
			System.out.println("Total Recurring Reimbursement value: "+element.getWebElement("XPATH",ReturnCalcPageElements.totalRecurringReimbursement).getText());
	 }
   }


