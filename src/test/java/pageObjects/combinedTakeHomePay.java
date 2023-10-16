package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class combinedTakeHomePay extends BasePage{
	
	public combinedTakeHomePay(WebDriver driver) {
	super(driver);
}
	
	//WebElements
	@FindBy(xpath="//summary[@aria-controls='universal-credit']")
	public WebElement summaryinfoclick;
	@FindBy(xpath="//input[@name='universalCreditTakeHomePay' and @value='Yes']")
	public WebElement UniversaltakeHomePayYes;
	@FindBy(xpath="//input[@name='universalCreditTakeHomePay' and @value='No']")
	public WebElement UniversaltakeHomePayNo;
	
	
	
}
