package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
	public Homepage homepage;
	public Page(WebDriver driver) {
		homepage = PageFactory.initElements(driver, Homepage.class);
	}

}
