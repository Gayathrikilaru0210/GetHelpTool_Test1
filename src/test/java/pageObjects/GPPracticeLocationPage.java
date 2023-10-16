package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPPracticeLocationPage extends BasePage{
	
	public GPPracticeLocationPage(WebDriver driver) {
	 super(driver);
 }
	
	//WebElements
	@FindBy(xpath="//input[@id='radio-no']")
	public WebElement GPNo;
	@FindBy(xpath="//input[@id='radio-yes']")
	public WebElement GPYes;
	@FindBy(xpath="//input[@value='Next']")
	public WebElement Next;
	
	public void clickNext() {
		Next.click();	
	}
	public void GPYes() {
		GPYes.click();
		
	}
	public void GPNo() {
		GPNo.click();
		
	}
	
	
	
}
