package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.WrapperEx;
import com.pages.Productdetails;

public class ProductTestCase extends WrapperEx {
	@BeforeClass
	public void startUp() 
	{
	 launchApplication("Chrome","https://www.amazon.in/");	
	}
	@Test
	public void product()
	{
		Productdetails pc = new Productdetails(driver);
		 pc.details_product();
		 pc.description();	
	}
	@AfterClass
	public void close() {
		close();
	}

}
