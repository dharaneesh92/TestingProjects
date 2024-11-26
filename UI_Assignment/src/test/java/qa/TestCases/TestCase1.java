package qa.TestCases;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageActions.HomePageActions;
import PageActions.ReturnCalcPageActions;
import Utils.FetchElement;

public class TestCase1 extends BaseTest{
	FetchElement Element=new FetchElement();
	HomePageActions hp=new HomePageActions();
	ReturnCalcPageActions rcp=new ReturnCalcPageActions();
  @Test
  public void revenueCalculatorTest() throws InterruptedException {
	  
	  hp.verifyHomePageElemnts();
	  hp.revenueCalculatorClick();
	  rcp.verifyReturncalcPageHeader();
	  rcp.slideToPoint(820);
	  rcp.textUpdateSlider(560);
	  rcp.selectCPTCodes();
	  rcp.validateReimbursement(75600);
  }
  
}
