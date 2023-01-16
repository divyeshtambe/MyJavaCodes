package demoCode;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebsite
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\abc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=LqQvVJjJPOLV8gfej4DIBg");
		

	}

}
