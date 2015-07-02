package com.etiam.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;


public class CSSValidation extends TestCore {
	
	@Test
	public void test_checkUncheckLeftPanel() throws Exception{
		Log.info("--------------test_checkUncheckLeftPanel START------------------");
		Log.info("getting details of visited, unvisited and current item under Left Panel");
		try{
			li = driver.findElements(By.cssSelector("div.item"));	

			for(int i=0;i<li.size();i++)
	        {
	               Log.info("test_checkUncheckLeftPanel: "+li.get(i).getText()+" : "+li.get(i).getAttribute("class")+" result code: ");
	        }
		
			Utility.implicitWait(5);
			Utility.writeResult("Pass",35);
		}catch(Exception e){
			Utility.writeResult("Fail",35);
			Log.info("test_checkUncheckLeftPanel: Element not found error");
		}
		
		Log.info("--------------test_checkUncheckLeftPanel DONE------------------");
		
	}
	
	

}
