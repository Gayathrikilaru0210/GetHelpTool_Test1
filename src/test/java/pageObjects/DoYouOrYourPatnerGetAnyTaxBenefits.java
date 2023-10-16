package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoYouOrYourPatnerGetAnyTaxBenefits extends BasePage{
	
	public DoYouOrYourPatnerGetAnyTaxBenefits(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@name='benefitsOrTaxCredits' and @value='Yes']")
	public WebElement taxBenefitsYes;
	@FindBy(xpath="//input[@name='benefitsOrTaxCredits' and @value='No']")
	public WebElement taxBenefitsNo;
	
	
}
