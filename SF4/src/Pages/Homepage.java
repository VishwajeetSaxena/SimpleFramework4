package Pages;

import javax.rmi.CORBA.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(id = "lst-ib")
	WebElement test;
	
	
	public void test()
	{
	 test.sendKeys("hi");
	}

}
