package com.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.WrapperEx;
import com.pages.SearchandSelect;

public class SearchTestCase extends WrapperEx {
	@BeforeClass
	public void startUp() 
	{
	 launchApplication("Chrome","https://www.amazon.in/");	
	}
	@Test
	public void search() 
	{
		SearchandSelect sc=new SearchandSelect(driver);
		sc.Search_searchbar("mobiles");
	    sc.Search_searchbtn();
	}
		

}
