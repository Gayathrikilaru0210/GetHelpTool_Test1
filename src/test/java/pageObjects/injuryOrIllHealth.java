package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class injuryOrIllHealth extends BasePage{
	
	public injuryOrIllHealth(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@class='button button-get-started']")
	public WebElement start;
	
	
	
}
