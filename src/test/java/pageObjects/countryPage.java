package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class countryPage extends BasePage{
	
	public countryPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@id='radio-england']")
	public WebElement CountryEngland;
	@FindBy(xpath="//input[@id='radio-scotland']")
	public WebElement Countryscotland;
	@FindBy(xpath="//input[@id='radio-wales']")
	public WebElement Countrywales;
	@FindBy(xpath="//input[@id='radio-nire)']")
	public WebElement Countrynire;
	
	public void CountryEngland() {
		CountryEngland.click();
	}
		
	public void Countryscotland() {
		Countryscotland.click();
	}
	public void Countrywales() {
		Countrywales.click();
	}
	public void Countrynire() {
		Countrynire.click();
	}


	
}
	
