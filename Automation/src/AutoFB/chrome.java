package AutoFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		{ System.setProperty("webdriver.chrome.driver","C:\\Users\\Samsung\\Downloads\\chromedriver_win32(1)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("reshma.bano56@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sajidabano");
		//driver.findElement(By.id("u_0_1")).sendKeys("sajidabano");
		}

	}

}
