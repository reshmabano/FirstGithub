package AutoFB;

import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBPage {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("reshmabano56@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sajidabano");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		//Dropdown by select class:
		
		WebElement drop =driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown= new Select(drop);
		Select.
		
		
		
		//driver.findElement(By.xpath("//input[contains(name,'ail')]")).sendKeys("res@gmail.com");
		
		
	}


