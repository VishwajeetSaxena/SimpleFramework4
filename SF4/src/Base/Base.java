package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Page;

public class Base {

	public WebDriver driver;
	public Page page;
	
	@BeforeSuite
	void initDriver(){
	 System.setProperty("webdriver.chrome.driver", "resources\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 page = new Page(driver);
	 
	 
	}
	
	@Test
	void TC1()
	{ 
		driver.get("https://www.google.com");
		page.homepage.test();
	}
	
	@AfterSuite
	void quitDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	
}
