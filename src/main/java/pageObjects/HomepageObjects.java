package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObjects {

	
	public WebDriver driver;
	
	By header = By.xpath("//*[@id=\"loginPage\"]/div/div/div[1]/div/h1");
	
	public HomepageObjects(WebDriver driver) {
		this.driver =driver;
	}

	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
