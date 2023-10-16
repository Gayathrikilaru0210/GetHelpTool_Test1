package TestSuit;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageActions.StartPagePageAction;
import pageObjects.getHelpStartPage;

public class TC1_StartPageTestcase {
	

	public WebDriver driver;
	getHelpStartPage sp;	
@Test
void StartTool(String br) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		System.out.println(driver.getTitle());	
	}


public void isStartDisplayed(){
	sp=new getHelpStartPage(driver);
	Assert.assertEquals(sp.StartButtonDisplayedCheck(),true);
}

  

}
