package com.etiam.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;

public class Footer extends TestCore {

	@Test
	public void test_NextPageButton() throws Exception{
		Log.info("--------------test_NextPageButton START------------------");
		Log.info("test_NextPageButton: Clicking Next Button");
		
			if(isElementPresent(By.xpath(object.getProperty("next")))){
				Utility.writeResult("Pass",11);
				Log.info("test_PreviousPageButton: Element Present");
			}else{
				Utility.writeResult("Fail",11);
				Log.info("test_PreviousPageButton: Element not found");
			}
			try{
			
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.implicitWait(2);
			Log.info("test_NextPageButton: Clicking Next Button");
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Utility.writeResult("Pass",12);
		}catch(Exception e){
			Utility.writeResult("Fail",12);
			Log.info("test_NextPageButton: Element not found error");
		}
			
		Log.info("--------------test_NextPageButton DONE------------------");

	}

	@Test
	public void test_PreviousPageButton() throws Exception{
		Log.info("--------------test_PreviousPageButton START------------------");
		Utility.implicitWait(2);
		if(isElementPresent(By.xpath(object.getProperty("previous")))){
			Utility.writeResult("Pass",13);
			Log.info("test_PreviousPageButton: Element present");
		}else{
			Utility.writeResult("Fail",13);
			Log.info("test_PreviousPageButton: Element not found");
		}
		try{
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.implicitWait(2);
			Log.info("test_PreviousPageButton: Clicking Next Previous Button");
			driver.findElement(By.xpath(object.getProperty("previous"))).click();
			Utility.writeResult("Pass",14);
		}catch(Exception e){
			Utility.writeResult("Fail",14);
			Log.info("test_PreviousPageButton: Element not found error");
		}
		
		Log.info("--------------test_PreviousPageButton DONE------------------");

	}

	@Test
	public void test_RefreshPageButton() throws Exception{
		Log.info("--------------test_RefreshPageButton START------------------");
		Utility.implicitWait(2);
		if(isElementPresent(By.xpath(object.getProperty("refresh")))){
			Utility.writeResult("Pass",15);
			Log.info("test_RefreshPageButton: Element present");
		}else{
			Utility.writeResult("Fail",15);
			Log.info("test_RefreshPageButton: Element not found");
		}
		try{
			Log.info("test_RefreshPageButton: Clicking Refresh Button");
			driver.findElement(By.xpath(object.getProperty("refresh"))).click();
			Utility.implicitWait(2);
			Utility.writeResult("Pass",16);
			Log.info("test_RefreshPageButton: Page Refreshed ");
		}catch(Exception e){
			Utility.writeResult("Fail",16);
			Log.info("test_RefreshPageButton: Element not found error");
		}
		
		Log.info("--------------test_RefreshPageButton DONE------------------");

	}

}
