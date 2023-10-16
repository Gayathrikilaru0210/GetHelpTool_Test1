package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class getHelpStartPage extends BasePage{
	
	public getHelpStartPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@class='button button-get-started']")
	public WebElement start;
	
public boolean StartButtonDisplayedCheck() {
		
		boolean status= start.isDisplayed();		
		return status;	
		
	}
public void startClick() {
	start.click();

}
}
