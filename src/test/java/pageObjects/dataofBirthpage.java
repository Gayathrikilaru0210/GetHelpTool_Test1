package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dataofBirthpage extends BasePage {

	public dataofBirthpage(WebDriver driver) {
		super(driver);
	}

	// WebElements
	@FindBy(xpath = "//input[@name='dateOfBirth.day']")
	public WebElement day;
	@FindBy(xpath = "//input[@name='dateOfBirth.month']")
	public WebElement month;
	@FindBy(xpath = "//input[@name='dateOfBirth.year']")
	public WebElement year;

	public void month(String month1) {
		month.sendKeys(month1);
	}

	public void year(String year1) {
		year.sendKeys(year1);
	}

	public void day(String day1) {
		day.sendKeys(day1);
	}
	

}
