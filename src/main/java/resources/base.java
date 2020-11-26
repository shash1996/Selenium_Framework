package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.*;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		 prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
	
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			
		}
		else if(browser.equalsIgnoreCase("IE")) {
			
		}
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
 
	public void getScreenshot(String methodname,WebDriver driver) {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
 
	 String destinationFile=System.getProperty("user.dir")+"\\reports\\"+methodname+".png";
	 try {
		org.apache.commons.io.FileUtils.copyFile(source, new File(destinationFile));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 
 }
}
