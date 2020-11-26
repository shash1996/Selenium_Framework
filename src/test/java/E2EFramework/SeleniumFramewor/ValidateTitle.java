package E2EFramework.SeleniumFramewor;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landing;
import pageObjects.loginPage;
import resources.base;

public class ValidateTitle extends base {
	private static Logger log =LogManager.getLogger(base.class.getName());
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException {

		Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		log.info("Its working");
		landing l=new landing(driver);
	
		

		
	}

	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
