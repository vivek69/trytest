package com.etiam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;
/*
@SpiraTestConfiguration(
		url="https://spirateam.e-navik.com/SpiraTeam",
		login="raghvendra.jadaun",
		password="Enavik2015!",
		projectId=47
		
		
		)
*/
public class Header_title extends TestCore {
	
	
	
	@Test
//	@SpiraTestCase(testCaseId=5118)
	public void test_Title() throws Exception{
		Log.info("--------------test_Title START------------------");
		Log.info("test_Title: Test Title");
		Utility.getscreenshot("HomePage.jpg");
		try{
			WebElement element= driver.findElement(By.xpath(object.getProperty("heading")));
			String title = element.getText();
			Log.info("test_Title: Title Present: "+title);
			Utility.writeResult("Pass",8);
			if(title.equals("Customer Releationship Management")){
				Utility.writeResult("Pass",9);
			}else{
				Utility.writeResult("Fail",9);
			}
		}catch(Exception e){
			Utility.writeResult("Fail",8);
			Log.info("test_Title: Element not found error");
		}
		
		Log.info("--------------test_Title DONE------------------");	
	}
	
	@Test
	public void test_Logo() throws Exception{	
		Log.info("--------------test_Logo START------------------");
		Log.info("test_Logo: Test Logo");
		try{
			driver.findElement(By.xpath(object.getProperty("logo")));
			Log.info("test_Logo: Logo Present");
			Utility.writeResult("Pass",10);
		}catch(Exception e){
			Utility.writeResult("Fail",10);
			Log.info("test_Title: Element not found error");
		}
		
		Log.info("--------------test_Logo DONE------------------");

	}
	

}
