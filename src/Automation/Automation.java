package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {
	
	@Test
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Personal\\Installers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
	    System.out.print(title);
	}
	
	
}
