package TestSuit;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UK_AgeBelow16 {
	
	WebDriver driver;
 
	@Test(priority=0)
  void StartTool() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='button button-get-started']")).click();
	  
  }
  
 @Test(priority=1)
 void Questionaire1() {
	 System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//input[@id='radio-england']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-scotland']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-wales']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-nire)']")).click();
	 
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	   
  }
  
@Test(priority=3)
   void Questionaire2() {
	
	System.out.println(driver.getTitle());
	 //click on Is your GP practice in Scotland or Wales
	 driver.findElement(By.xpath("//input[@id='radio-no']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-yes']")).click();
	 //click on Next
	 driver.findElement(By.xpath("//input[@value='Next']")).click(); 
	  
  }

@Test(priority=4)
void Questionaire3() {
	
	System.out.println(driver.getTitle());
	//Which country is your dental practice in?
	 driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='ENGLAND']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='SCOTLAND']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='WALES']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='NORTHERN_IRELAND']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='NOT_REGISTERED_WITH_DENTAL_PRACTICE']")).click();
	 //click on Next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 }
@Test(priority=5)
void Questionaire4() {
	
	System.out.println(driver.getTitle());
	//What is your date of birth?
		 driver.findElement(By.xpath("//input[@name='dateOfBirth.day']")).sendKeys("02");
		 driver.findElement(By.xpath("//input[@name='dateOfBirth.month']")).sendKeys("10");
		 driver.findElement(By.xpath("//input[@name='dateOfBirth.year']")).sendKeys("2019");
	 //click on Next
	 driver.findElement(By.xpath("//input[@value='Next']")).click(); 
	  }
@Test(priority=6)
void Questionaire10() {
	
	System.out.println(driver.getTitle());
	String resultActualText = driver.findElement(By.xpath("//h2[text()='You get free:']")).getText();
	String expectedResult = "You get free:";
	System.out.println("Check what help you will get");
	  if (resultActualText.equals(expectedResult)) {
		  
		  System.out.println(" you will get free help");
	  }
	  else {
		  System.out.println("you will not get free help");
	  }
	  String resultActualText1 = driver.findElement(By.xpath("//h2[text()='You get money off:']")).getText();
     String expectedResult1 = "You get money off:";
     
     if (resultActualText1.equals(expectedResult1)) {
		  System.out.println(" you will get money off");
	  }
	  else {
		  System.out.println("you will not get money off");
	  }
	}
@Test(priority=12)
void Questionaire11() {
	
	System.out.println(driver.getTitle());
	driver.quit();
	
	}
}
