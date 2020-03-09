package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx {
protected WebDriver driver;
	
	public void launchApplication(String browser, String url) {
		
		try {
			//launching firefox//
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}
			//launching chrome//
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} 
		catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
	}
	//takes screenshot//
	public void ScreenShot() throws IOException 
	{
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\New folder\\testmaven\\ScreenShot"));
	}
	//to close the browser//
	public void closeapp()
	{
		driver.close();

}
}
