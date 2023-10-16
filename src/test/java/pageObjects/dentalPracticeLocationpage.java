package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dentalPracticeLocationpage extends BasePage{
	
	public dentalPracticeLocationpage(WebDriver driver) {
	 super(driver);
 }
	//WebElements
	@FindBy(xpath="//input[@name='dentalPracticeCountry' and @value='ENGLAND']")
	public WebElement dentalEngland;
	@FindBy(xpath="//input[@name='dentalPracticeCountry' and @value='SCOTLAND']")
	public WebElement dentalSCOTLAND;
	@FindBy(xpath="//input[@name='dentalPracticeCountry' and @value='WALES']")
	public WebElement dentalWALES;
	@FindBy(xpath="//input[@name='dentalPracticeCountry' and @value='NORTHERN_IRELAND']")
	public WebElement dentalNIRE;
	@FindBy(xpath="//input[@name='dentalPracticeCountry' and @value='NOT_REGISTERED_WITH_DENTAL_PRACTICE']")
	public WebElement dentalNotRegistered;
	public void dentalEngland() {
		dentalEngland.click();
		
	}
	
	
}
