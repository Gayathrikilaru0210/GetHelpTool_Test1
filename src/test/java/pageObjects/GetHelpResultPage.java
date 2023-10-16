package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetHelpResultPage extends BasePage{
	
	public GetHelpResultPage(WebDriver driver) {
	 super(driver);
 }
	
	
	//WebElements
	@FindBy(xpath="//h2[text()='You get free:']")
	public WebElement getFreehelp;
	@FindBy(xpath="//h2[text()='You get money off:']")
	public WebElement getMoneyOff;
	
	
}
