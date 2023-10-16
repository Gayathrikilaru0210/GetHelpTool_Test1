package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.getHelpStartPage;
import org.openqa.selenium.support.PageFactory;



public class StartPagePageAction {
	
	WebDriver driver;
	
	getHelpStartPage pageLocations;
	
	public StartPagePageAction(WebDriver driver){
		this.pageLocations=new getHelpStartPage(driver);
		PageFactory	.initElements(this.driver,pageLocations);	
	}
	
	public boolean StartButtonDisplayedCheck() {
		
		boolean status= pageLocations.start.isDisplayed();		
		return status;	
		
	}
	public boolean clickStart() {
		pageLocations.start.click();	
		return true;
		
		
	}
}
