package ApplicatioPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirstPage {

	WebDriver driver;
	 
	 
	public FirstPage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	 
	 
	@FindBy(xpath="//span[text()='  Log In']")
	WebElement login; 
	 
	@FindBy(xpath="//span[text()='Home']")
	WebElement Home;
	 
   public void loginpage()
	{
	//username.sendKeys(uid);
	//password.sendKeys(pass);
	login.click();
	}
   

   public String getApplicationTitle(){
   	
   	return (driver.getTitle());
   }

	
}
