package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jointUniversalCreditPage extends BasePage{
	
	public jointUniversalCreditPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@name='universalCreditIncludePayments' and @value='Yes']")
	public WebElement universalCreditYes;
	@FindBy(xpath="//input[@name='universalCreditIncludePayments' and @value='No']")
	public WebElement universalCreditNo;
	
	
	
}
