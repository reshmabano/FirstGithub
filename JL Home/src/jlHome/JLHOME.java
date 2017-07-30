package jlHome;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JLHOME {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/**driver.get("https://pltestweb.rsagroup.co.uk/MAINT/TEST_ATE/JLHome/quoteAndBuy.do?");
		
		driver.findElement(By.xpath("//input[@id='addressLookupPostcodeInputNormal']")).sendKeys("RH121XL");
		driver.findElement(By.xpath("//input[@name='_eventId_addressLokupJLDCSearchNormal'])")).click();
		//driver.findElement(By.xpath("//label[@id='policyHolderLivesHereCD-y-label']")).click();
		//WebElement drop= driver.findElement(By.xpath(".//*[@id='yourDetailsPolicyOwnershipStatus']"));
		//Select sel = new Select(drop);
		//sel.deselectByIndex(0);**/
		
		driver.get("https://amazon.com");
		
		Actions mouse = new Actions(driver);
		WebElement orders = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		mouse.moveToElement(orders);
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("reshmabano56@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("dost");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
				
		
		

	}

}

