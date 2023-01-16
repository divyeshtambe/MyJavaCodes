package demoCode;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class locators 
{
	@Test
	public void Test1()  
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//open website
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.name("username")).sendKeys("Admin");//enter username
		driver.findElement(By.name("password")).sendKeys("admin123");//enter password
		driver.findElement(By.className("oxd-button")).click();//click on login button

		String act = driver.getCurrentUrl();
		
	
		
	}
	
	
}