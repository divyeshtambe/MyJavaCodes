package demoCode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class chrometest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Chrome_Driver\\cd\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=LqQvVJjJPOLV8gfej4DIBg");
		
	}

}
