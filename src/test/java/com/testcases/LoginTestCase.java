package com.testcases;

import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.WrapperEx;
import com.pages.LoginPage;

public class LoginTestCase extends WrapperEx{
	@BeforeClass  //use before method//
	public void startUp() 
	{
	 launchApplication("Chrome","https://www.amazon.in/");	
	}
	@Test
	public void login()
	{
		LoginPage lc = new LoginPage(driver);
		lc.LoginClass_Hellosignin();
		lc.LoginClass_Email("6309390396");
		lc.LoginClass_Continue();
		lc.LoginClass_password("Triveni@v");
		lc.LoginClass_login();
		
		
	}
	//@AfterClass
	//public void ScreenShot() 
	{
		//ScreenshotException ts=new ScreenshotException(driver);
		//ts.ScreenShot("C:\\New folder\\testmaven\\ScreenShot");
		
        // closeapp();
	}
}
