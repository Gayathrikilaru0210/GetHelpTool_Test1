package TestBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getHelp {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		//launching webDriver
	 WebDriver driver= new ChromeDriver();
	 //getting the getHelp URL
	 
	 driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	 driver.manage().window().maximize();
	 Thread.sleep(500);
	 System.out.println(driver.getTitle());
	 
	 TakesScreenshot ts= (TakesScreenshot) driver;
	 File src= ts.getScreenshotAs(OutputType.FILE);
	 File target=new File("C:\\Users\\home\\eclipse-workspace\\seleniumProject\\Screenshots\\NHSGetHelpToolStartPage.png");
	 FileUtils.copyFile(src,target);	
	 
	 WebElement start=driver.findElement(By.xpath("//input[@class='button button-get-started']"));
	 File tool= start.getScreenshotAs(OutputType.FILE);
	 File trg=new File("C:\\Users\\home\\eclipse-workspace\\\\Screenshots\\NHSGetHelpToolStartPageStratButton.png");
	 FileUtils.copyFile(tool,trg);
	 driver.findElement(By.xpath("//input[@class='button button-get-started']")).click();
	 //click on England
	 
	 driver.findElement(By.xpath("//input[@id='radio-england']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-scotland']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-wales']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-nire)']")).click();
	 
	 //click on Next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 System.out.println(driver.getTitle());
	 //click on Is your GP practice in Scotland or Wales
	 driver.findElement(By.xpath("//input[@id='radio-no']")).click();
	 //driver.findElement(By.xpath("//input[@id='radio-yes']")).click();
	 
	 //click on Next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 
	 //Which country is your dental practice in?
	  Thread.sleep(500);
	  System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='ENGLAND']")).click();
	
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='SCOTLAND']")).click();
	 
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='WALES']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='NORTHERN_IRELAND']")).click();
	 //driver.findElement(By.xpath("//input[@name='dentalPracticeCountry' and @value='NOT_REGISTERED_WITH_DENTAL_PRACTICE']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 System.out.println(driver.getTitle());
	 //What is your date of birth?
	 driver.findElement(By.xpath("//input[@name='dateOfBirth.day']")).sendKeys("02");
	 driver.findElement(By.xpath("//input[@name='dateOfBirth.month']")).sendKeys("10");
	 driver.findElement(By.xpath("//input[@name='dateOfBirth.year']")).sendKeys("1998");
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 Thread.sleep(500);
	 System.out.println(driver.getTitle());
	 // Do you live with a partner?
	 driver.findElement(By.xpath("//input[@name='partner' and @value='Yes']")).click();
	//driver.findElement(By.xpath("//input[@name='partner' and @value='No']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();

	 System.out.println(driver.getTitle());
	 //Do you or your partner claim any benefits or tax credits?
	 driver.findElement(By.xpath("//input[@name=\"benefitsOrTaxCredits\" and @value='Yes']")).click();
	 //driver.findElement(By.xpath("//input[@name=\"benefitsOrTaxCredits\" and @value='No']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	
	 System.out.println(driver.getTitle());
	 //Do you or your partner get paid Universal Credit?
	 driver.findElement(By.xpath("//input[@value='YES_I_RECEIVED_UNIVERSAL_CREDIT']")).click();
	 //driver.findElement(By.xpath("//input[@value='NOT_YET']")).click();
	 //driver.findElement(By.xpath("///input[@value='NO_I_GET_DIFFERENT_BENEFIT']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 System.out.println(driver.getTitle());
	 //As part of your joint Universal Credit, do you have any of these?
	 driver.findElement(By.xpath("//input[@name='universalCreditIncludePayments' and @value='Yes']")).click();
	 //driver.findElement(By.xpath("//input[@name='universalCreditIncludePayments' and @value='No']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
	 System.out.println(driver.getTitle());
	 //Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
	 //click to see info
	 driver.findElement(By.xpath("//summary[@aria-controls='universal-credit']")).click();
	 //choose now for Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
	 driver.findElement(By.xpath("//input[@name='universalCreditTakeHomePay' and @value='Yes']")).click();
	 //driver.findElement(By.xpath("//input[@name='universalCreditTakeHomePay' and @value='No']")).click();
	 
	 //click on next
	 driver.findElement(By.xpath("//input[@value='Next']")).click();
	 
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
	  //close driver
	  driver.quit();
	  
	
	 
	 
	 
	 
	}

}
