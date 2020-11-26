package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	
	public WebDriver driver;
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signinbutton=By.xpath("//input[@class='signinbtn']");
	public loginPage(WebDriver driver) {
	
		this.driver = driver;
	}

	public WebElement getUsername() {
		
		return driver.findElement(username);
		
	}
	
	public WebElement getpassword() {
		
		return driver.findElement(password);
		
	}

	
	public WebElement getsignbtn() {
		
		return driver.findElement(signinbutton);
		
	}



}
