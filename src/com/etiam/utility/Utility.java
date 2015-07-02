package com.etiam.utility;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.etiam.core.Log;
import com.etiam.core.TestCore;

public class Utility extends TestCore {

	// Drag and drop

	public static void dragAndDrop(String from, String to)
			throws InterruptedException {
		Log.info("Moving button");
		WebElement From = driver.findElement(By.xpath(from));
		WebElement To = driver.findElement(By.xpath(to));

		Actions slider = new Actions(driver);
		Action action = slider.clickAndHold(From).moveToElement(To).release(To)
				.build();
		action.perform();
		Thread.sleep(1500);

	}

	// Color code conversion

	public static String colorCode(String color) {
		String[] hexValue = color.replace("rgba(", "").replace(")", "")
				.split(",");
		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1,
				hexValue2, hexValue3);
		return actualColor;
	}

	//Validate Hover
	public static void HooverAction(WebElement element) {

		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
	}
	
	//Implicit Wait
	
	public static void implicitWait(long seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void getscreenshot(String filename) throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//src//com//etiam//screenshots//"+filename));
    }
	
	public static void writeResult(String status, int RowNum) throws Exception{
		
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"//src//com//etiam//data//Validation.xlsx", "TestCase");
		ExcelUtils.setCellData(status, RowNum, 4);
	}
	
}
