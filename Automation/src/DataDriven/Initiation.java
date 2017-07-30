package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Initiation {

	@Test
	public void checkValidUser()
	{
	 
	// This will launch browser and specific url 
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
	 
	// Created Page Object using Page Factory
	POM login_page=PageFactory.initElements(driver, POM.class);
	 
	// Call the method
	login_page.login_wordpress("admin", "demo123");
	
	
	 
	}
}
