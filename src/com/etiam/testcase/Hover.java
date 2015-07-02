package com.etiam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;

@Test
public class Hover extends TestCore {
	
	public void testHover() throws Exception{
		Log.info("--------------testHover START------------------");
		Log.info("testHover: Checking Hover");
		Utility.implicitWait(2);
		try{
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("eTOM_2")));

			
			String s1 = Utility.colorCode(e1.getCssValue("color"));
			//System.out.println("Color of element before hover: "+s1 );
			
			Log.info("testHover: Color of element after hover: "+s1);
			Utility.HooverAction(e1);
			
			Utility.implicitWait(2);
			WebElement e2  = driver.findElement(By.xpath(object.getProperty("Billing")));
			Utility.HooverAction(e2);
			Utility.implicitWait(2);
			Utility.writeResult("Pass",34);
		}catch(Exception e){
			Utility.writeResult("Fail",34);
			Log.info("testHover: Element not found error");
		}
		
		Log.info("--------------testHover DONE------------------");
		
		
		
	}

}
