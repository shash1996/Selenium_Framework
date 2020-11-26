package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landing {
	
	
	public WebDriver driver;
	
	public landing(WebDriver driver) {
	
		this.driver = driver;
	}

	public WebElement getLogin() {
		By signin=By.xpath("//a[@class='signin']");
		return driver.findElement(signin);
		
	}


}
