package E2EFramework.SeleniumFramewor;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landing;
import pageObjects.loginPage;
import resources.base;

public class HomePage extends base {
	private static Logger log =LogManager.getLogger(base.class.getName());
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
	
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username,String Password) throws IOException {

		driver.get(prop.getProperty("url"));
		landing l=new landing(driver);
		l.getLogin().click();
		
		loginPage lp=new loginPage(driver);
		lp.getUsername().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.getsignbtn().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		data[0][0]="asdf@gmail.com";
		data[0][1]="password123";
		
		data[1][0]="as122df@gmail.com";
		data[1][1]="password123";
		return data;
	}

	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
