package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getHelplocalCouncilForCareHome extends BasePage{
	
	public getHelplocalCouncilForCareHome(WebDriver driver) {
	 super(driver);
 }
	
	
	//WebElements
	@FindBy(xpath="//input[@class='button button-get-started']")
	public WebElement start;
	
	
	
}
