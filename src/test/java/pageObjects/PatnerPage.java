package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatnerPage extends BasePage{
	
	public PatnerPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@name='partner' and @value='Yes']")
	WebElement partnerYes;
	@FindBy(xpath="//input[@name='partner' and @value='No']")
	WebElement partnerNo;
	
	public void partnerYes() {
		partnerYes.click();
		
	}
	public void partnerNo() {
		partnerNo.click();
		
	}
	
	
	
	
}
