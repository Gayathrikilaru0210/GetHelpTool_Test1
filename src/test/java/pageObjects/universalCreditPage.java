package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class universalCreditPage  extends BasePage{
	
	public universalCreditPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@value='YES_I_RECEIVED_UNIVERSAL_CREDIT']")
	public WebElement UniversalCreditYes;
	@FindBy(xpath="//input[@value='NOT_YET']")
	public WebElement UniversalCreditNotYet;
	@FindBy(xpath="//input[@value='NO_I_GET_DIFFERENT_BENEFIT']")
	public WebElement UniversalCreditNo;
	
	public void UniversalCreditYes() {
		UniversalCreditYes.click();
	}
	public void UniversalCreditNo() {
		UniversalCreditNo.click();
	}
	public void UniversalCreditNotYet() {
		UniversalCreditNotYet.click();
	}
	
	
	
}
