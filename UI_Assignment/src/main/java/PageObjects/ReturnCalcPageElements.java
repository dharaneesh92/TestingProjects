package PageObjects;

public interface ReturnCalcPageElements {

	String returnCalcPageHeader="//h4[contains(text(),'How Many Medicare Patients Would You Include in')]";
	String sliderView="MuiBox-root css-79elbk";
	String sliderElement="//input[@type='range']";
    String sliderInputValue="//input[@type='range']/following::input[@type='number']";
    String cptCodeCollection="//p[contains(text(),'CPT-99091')]/following::span[normalize-space()='57']";
    String cptCodeMonitoring="//p[contains(text(),'CPT-99453')]/following::span[normalize-space()='19.19']";
    String cptCodeReimbursemnent="//p[contains(text(),'CPT-99454')]/following::span[normalize-space()='63']";
    String cptCodeReadings="//p[contains(text(),'CPT-99474')]/following::span[normalize-space()='15']";
    String totalRecurringReimbursement="//div[@class='MuiBox-root css-m1khva']/child::p[contains(text(),'$')]";
    
}
