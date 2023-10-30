package StepDef;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.BasePage;
import pageObjects.GPPracticeLocationPage;
import pageObjects.GetHelpResultPage;
import pageObjects.PatnerPage;
import pageObjects.countryPage;
import pageObjects.dataofBirthpage;
import pageObjects.dentalPracticeLocationpage;
import pageObjects.getHelpStartPage;
import utilities.DataReader;

public class steps {
	WebDriver driver;
	BasePage Bp;
	getHelpStartPage hp;
	countryPage cp;
	GPPracticeLocationPage gp;
	dentalPracticeLocationpage  dp;
	dataofBirthpage dbp;
	GetHelpResultPage ghp;
	PatnerPage pp;
	
	@Given("browser is launched")
	public void browser_is_launched() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}
	
	@Given("Maximize the browser Window")
	public void maximize_the_browser_window() {
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	@When("opens URL {string}")
	public void opens_url(String url) {
		 driver.get(url);
	        driver.manage().window().maximize();
	}

	@When("the user clicks on start Element at the getHelpStartPage page")
	public void the_user_clicks_on_start_element_at_the_get_help_start_page_page() throws PendingException{
		hp=new getHelpStartPage(driver);
		hp.startClick();
		  
	}

	@When("the user clicks on CountryEngland Element at the countryPage page")
	public void the_user_clicks_on_country_england_element_at_the_country_page_page() throws PendingException{
		cp=new countryPage(driver);
		cp.CountryEngland();
		gp=new GPPracticeLocationPage(driver);
		gp.clickNext();
		
	}

	@When("the user clicks on next Element at the GPPracticeLocationPage page")
	public void the_user_clicks_on_next_element_at_the_gp_practice_location_page_page() throws PendingException{
		gp=new GPPracticeLocationPage(driver);
		gp.clickNext();
	}

	@When("the user clicks on GPYes Element at the GPPracticeLocationPage page")
	public void the_user_clicks_on_gp_yes_element_at_the_gp_practice_location_page_page() throws PendingException{
		gp=new GPPracticeLocationPage(driver);
		gp.GPYes();
	}

	@When("the user clicks on dentalEngland Element at the dentalPracticeLocationpage page")
	public void the_user_clicks_on_dental_england_element_at_the_dental_practice_locationpage_page() throws PendingException{
		dp=new dentalPracticeLocationpage(driver);
		dp.dentalEngland();  
	}

@When("the user Enters on {string} into the day textbox at the dataofBirthpage page")
public void the_user_enters_on_into_the_day_textbox_at_the_dataof_birthpage_page(String day1) throws PendingException{
    dbp= new dataofBirthpage(driver);
    dbp.day(day1);
}

@When("the user Enters on {string} into the month textbox at the dataofBirthpage page")
public void the_user_enters_on_into_the_month_textbox_at_the_dataof_birthpage_page(String month1) throws PendingException{
	dbp= new dataofBirthpage(driver);
    dbp.month(month1);
}


@When("the user Enters on {string} into the year textbox at the dataofBirthpage page")
public void the_user_enters_on_into_the_year_textbox_at_the_dataof_birthpage_page(String year1)throws PendingException {
	dbp= new dataofBirthpage(driver);
    dbp.year(year1);

}

@When("the user clicks on patnerNo Element at the PatnerPage page")
public void the_user_clicks_on_patner_no_element_at_the_patner_page_page() {
   pp = new PatnerPage(driver);
   pp.partnerNo();
}
	

@Then("the user takes the screenshot {string}")
public void the_user_takes_the_screenshot(Scenario scenario) throws PendingException {
	 
	        System.out.println("Scenario status ======>"+scenario.getStatus());
	         
	             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png",scenario.getName());
	           
	       driver.quit();
	    }


	
	@When("the user verifies on {string} visible at GetHelpResultPage page")
	public void the_user_verifies_on_visible_at_get_help_result_page_page(String free) throws PendingException{
		ghp=new GetHelpResultPage(driver);
		String resultActualText = "";
		try {
		WebElement ActualText = driver.findElement(By.xpath("//h2[text()='You get free:']"));
		resultActualText=ActualText.getText();
		}
		catch(NoSuchElementException e) {
			resultActualText = "";
		}
		String expectedResult = free;
		System.out.println("Check what help you will get");
		  if (resultActualText.equals(expectedResult)) {
			  
			  System.out.println(" you will get free help");
		  }
		  else {
			  System.out.println("you will not get free help");
		  }
		  String resultActualText1=" ";
		  try {
		  WebElement ActualText1 = driver.findElement(By.xpath("//h2[text()='You get money off:']"));
		  resultActualText1=ActualText1.getText();
		  }	
		  catch(NoSuchElementException e) {
				resultActualText1 = " ";
			}

	     String expectedResult1 = "You get money off:";
	     
	     if (resultActualText1.equals(expectedResult1)) {
			  System.out.println(" you will get money off");
		  }
		  else {
			  System.out.println("you will not get money off");
		  }
}
	
	@Then("the user closes the browser")
	public void the_user_closes_the_browser() throws PendingException{
	    // Write code here that turns the phrase above into concrete actions
		ghp=new GetHelpResultPage(driver);
		driver.quit();
	}

}
    



