package ApplicatioPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
	WebDriver driver;
	

	@BeforeMethod
	
	public void Firstpage() {
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Downloads\\chromedriver.exe");
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://fashiontrend.myavactis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void testHomePage(){
			
	FirstPage login_page=PageFactory.initElements(driver, FirstPage.class);
	String title = login_page.getApplicationTitle();

	Assert.assertTrue(title.contains("Avactis Demo Store"));
	//login_page.loginpage();
	
}
	@AfterMethod
	public void tearDown(){
		

		driver.quit();
	}
	

}



	
	 
	

