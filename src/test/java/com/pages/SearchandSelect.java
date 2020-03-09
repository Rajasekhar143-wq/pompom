package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchandSelect {
	WebDriver driver;
	By searchbar=By.id("twotabsearchtextbox");
	By searchbtn=By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");
	
	  public SearchandSelect(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	
	public void  Search_searchbar(String values) {
		driver.findElement(searchbar).sendKeys(values);
	}
	public void Search_searchbtn()  {
		driver.findElement(searchbtn).click();
		
	}

}
