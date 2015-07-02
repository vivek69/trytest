package com.etiam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;
import com.etiam.utility.Validation;

public class LeftPanel extends TestCore {
	
	@Test
	public void test_PrinciplesOfCRM() throws Exception{	
		Log.info("--------------test_PrinciplesOfCRM START------------------");
		Log.info("test_PrinciplesOfCRM: Clicking on Principles of CRM button");
		
		if(isElementPresent(By.xpath(object.getProperty("Principles_of_CRM")))){
			Utility.writeResult("Pass",17);
			Log.info("test_PrinciplesOfCRM: Element Present");
		}else{
			Utility.writeResult("Fail",17);
			Log.info("test_PrinciplesOfCRM: Element not found");
		}
		try{
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("Principles_of_CRM")));
			
			Validation v1 = new Validation(e1,2);
			v1.validate();
			driver.findElement(By.xpath(object.getProperty("Principles_of_CRM"))).click();
			Log.info("test_PrinciplesOfCRM: Switch Frame");
			driver.switchTo().frame(object.getProperty("container"));
			Utility.getscreenshot("Principles_of_CRM_Main.jpg");
			Utility.writeResult("Pass",18);
			
		}catch(Exception e){
			Utility.writeResult("Fail",18);
			Log.info("test_PrinciplesOfCRM: Element not found error");
		}
		
		try{
			Log.info("Clicking Img");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_1"))).click();
			Utility.implicitWait(2);
			Log.info("test_PrinciplesOfCRM: Click on resized image");
			Utility.getscreenshot("Principles_of_CRM_Image1.jpg");
			driver.findElement(By.xpath(object.getProperty("Principle1"))).click();
			Utility.implicitWait(2);
			Log.info("test_PrinciplesOfCRM: Clicking Img");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_1_1"))).click();
			Utility.implicitWait(2);
			Log.info("test_PrinciplesOfCRM: Click on resized image");
			Utility.getscreenshot("Principles_of_CRM_Image2.jpg");
			driver.findElement(By.xpath(object.getProperty("Principle2"))).click();
			Utility.implicitWait(2);
			Log.info("test_PrinciplesOfCRM: Switch to Default Frame");
			driver.switchTo().defaultContent();
			Utility.writeResult("Pass",19);
		}catch(Exception e){
			Utility.writeResult("Fail",19);
			Log.info("test_PrinciplesOfCRM: Element not found error");
		}
		
		Log.info("--------------test_PrinciplesOfCRM DONE------------------");

	}
	
	@Test
	public void test_CapabilitiesOfCRM() throws Exception{		
		Log.info("--------------test_CapabilitiesOfCRM START------------------");
		Log.info("test_CapabilitiesOfCRM: Clicking on Capabilities of CRM button");
		
		if(isElementPresent(By.xpath(object.getProperty("Capabilities_of_CRM")))){
			Utility.writeResult("Pass",20);
			Log.info("Capabilities_of_CRM: Element Present");
		}else{
			Utility.writeResult("Fail",20);
			Log.info("Capabilities_of_CRM: Element not found");
		}
		try{
			driver.findElement(By.xpath(object.getProperty("Capabilities_of_CRM"))).click();
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("Capabilities_of_CRM")));
			Validation v1 = new Validation(e1,2);
			v1.validate();
			Log.info("test_CapabilitiesOfCRM: Switch Frame");
			Utility.getscreenshot("CapabilityOfCRM_Main.jpg");
			driver.switchTo().frame(object.getProperty("container"));
			Utility.writeResult("Pass",21);
		}catch(Exception e){
			Utility.writeResult("Fail",21);
			Log.info("Capabilities_of_CRM: Element not found error");
		}
		
		try{
			Log.info("Clicking on 1st image");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_1"))).click();
			Utility.implicitWait(2);
			Utility.getscreenshot("CapabilityOfCRM_Image1.jpg");
			Log.info("test_CapabilitiesOfCRM: Clicking on 2nd image");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_1_1"))).click();
			Utility.implicitWait(2);
			Utility.getscreenshot("CapabilityOfCRM_Image2.jpg");
			Log.info("test_CapabilitiesOfCRM: Clicking on 3rd image");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_2"))).click();
			Utility.implicitWait(2);
			Utility.getscreenshot("CapabilityOfCRM_Image3.jpg");
			Log.info("test_CapabilitiesOfCRM: Clicking on 4th image");
			driver.findElement(By.xpath(object.getProperty("Capabilities_img_2_1"))).click();
			Utility.implicitWait(2);
			Utility.getscreenshot("CapabilityOfCRM_Image4.jpg");
			Log.info("test_CapabilitiesOfCRM: Switch to Default Frame");
			driver.switchTo().defaultContent();
			Utility.writeResult("Pass",22);
		}catch(Exception e){
			Utility.writeResult("Fail",22);
			Log.info("Capabilities_of_CRM: Element not found error");
		}
		
		
		Log.info("--------------test_CapabilitiesOfCRM DONE------------------");

	}
	
	@Test
	public void test_FrontEndAndBackendFunctions() throws Exception{	
		Log.info("--------------test_FrontEndAndBackendFunctions START------------------");
		Log.info("test_FrontEndAndBackendFunctions: Clicking on Capabilities of CRM button");
		
		if(isElementPresent(By.xpath(object.getProperty("Front-end")))){
			Utility.writeResult("Pass",23);
			Log.info("test_FrontEndAndBackendFunctions: Element Present");
		}else{
			Utility.writeResult("Fail",23);
			Log.info("test_FrontEndAndBackendFunctions: Element not found");
		}
		
		try{
			driver.findElement(By.xpath(object.getProperty("Front-end"))).click();
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("Front-end")));
			Validation v1 = new Validation(e1,2);
			v1.validate();
			Log.info("test_FrontEndAndBackendFunctions: Switch Frame");
			driver.switchTo().frame(object.getProperty("container"));
			Utility.writeResult("Pass",24);
		}catch(Exception e){
			Utility.writeResult("Fail",24);
			Log.info("test_FrontEndAndBackendFunctions: Element not found error");
		}
		
		try{
			Log.info("test_FrontEndAndBackendFunctions: Validating image present or not");
			Utility.getscreenshot("FrontEndAndBackendFunctions_Main.jpg");
			driver.findElement(By.xpath(object.getProperty("image")));
			Log.info("test_FrontEndAndBackendFunctions: Validating present");
			Log.info("test_FrontEndAndBackendFunctions: Switch to Default Frame");
			driver.switchTo().defaultContent();
			Utility.writeResult("Pass",25);
		}catch(Exception e){
			Utility.writeResult("Fail",25);
			Log.info("test_FrontEndAndBackendFunctions: Element not found error");
		}
		
		Log.info("--------------test_FrontEndAndBackendFunctions DONE------------------");

	}
	
	@Test
	public void test_eTOMAssessment1() throws Exception{	
		Log.info("--------------test_eTOMAssessment1 START------------------");
		Log.info("test_eTOMAssessment1: Clicking on 1st Assignment");
		
		if(isElementPresent(By.xpath(object.getProperty("eTOM_1")))){
			Utility.writeResult("Pass",26);
			Log.info("test_eTOMAssessment1: Element Present");
		}else{
			Utility.writeResult("Fail",26);
			Log.info("test_eTOMAssessment1: Element not found");
		}
		try{
			driver.findElement(By.xpath(object.getProperty("eTOM_1"))).click();
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("eTOM_1")));
			Validation v1 = new Validation(e1,2);
			v1.validate();
			
			Log.info("test_eTOMAssessment1: Switch Frame");
			driver.switchTo().frame(object.getProperty("container"));
			Utility.writeResult("Pass",27);
		}catch(Exception e){
			Utility.writeResult("Fail",27);
			Log.info("test_eTOMAssessment1: Element not found error");
		}
		try{
			Log.info("test_eTOMAssessment1: Clicking Submit");
			Utility.getscreenshot("eTOMAssessment1_Main.jpg");
			driver.findElement(By.xpath(object.getProperty("submit"))).click();
			Utility.getscreenshot("eTOMAssessment1_submit.jpg");
			Log.info("test_eTOMAssessment1: Clicking Retry");
			driver.findElement(By.xpath(object.getProperty("retry"))).click();
			Utility.writeResult("Pass",28);
		}catch(Exception e){
			Utility.writeResult("Fail",28);
			Log.info("test_eTOMAssessment1: Element not found error");
		}
		
		try{
			Utility.implicitWait(2);
			Utility.dragAndDrop(object.getProperty("var1"),object.getProperty("optcase_4"));
			Log.info("test_eTOMAssessment1: move successfull");
			Utility.getscreenshot("eTOMAssessment1_optcase_4.jpg");
			Utility.dragAndDrop(object.getProperty("var2"),object.getProperty("optcase_3"));
			Log.info("test_eTOMAssessment1: move successfull");
			Utility.getscreenshot("eTOMAssessment1_optcase_3.jpg");
			Utility.dragAndDrop(object.getProperty("var3"),object.getProperty("optcase_1"));
			Log.info("test_eTOMAssessment1: move successfull");
			Utility.getscreenshot("eTOMAssessment1_optcase_1.jpg");
			Utility.dragAndDrop(object.getProperty("var4"),object.getProperty("optcase_2"));
			Log.info("test_eTOMAssessment1: move successfull");
			Utility.implicitWait(2);
			Utility.getscreenshot("eTOMAssessment1_optcase_2.jpg");
			Log.info("test_eTOMAssessment1: Clicking Submit");
			driver.findElement(By.xpath(object.getProperty("submit"))).click();
			Log.info("test_eTOMAssessment1: Switch to Default Frame");
			Utility.getscreenshot("eTOMAssessment1_submit2.jpg");
			driver.switchTo().defaultContent();
			Utility.writeResult("Pass",29);
		}catch(Exception e){
			Utility.writeResult("Fail",29);
			Log.info("test_eTOMAssessment1: Element not found error");
		}
		
		
		Log.info("--------------test_eTOMAssessment1 DONE------------------");

	}
	
	@Test
	public void test_eTOMAssessment2() throws Exception{
		Log.info("--------------test_eTOMAssessment2 START------------------");
		Log.info("test_eTOMAssessment2: Clicking on 2nd Assignment");
		
		if(isElementPresent(By.xpath(object.getProperty("eTOM_2")))){
			Utility.writeResult("Pass",30);
			Log.info("test_eTOMAssessment1: Element Present");
		}else{
			Utility.writeResult("Fail",30);
			Log.info("test_eTOMAssessment1: Element not found");
		}
		try{
			driver.findElement(By.xpath(object.getProperty("eTOM_2"))).click();
			
			WebElement e1 = driver.findElement(By.xpath(object.getProperty("eTOM_2")));
			Validation v1 = new Validation(e1,2);
			v1.validate();
			Log.info("test_eTOMAssessment2: Switch Frame");
			Utility.getscreenshot("eTOMAssessment2_Main.jpg");
			driver.switchTo().frame(object.getProperty("container"));
			Utility.writeResult("Pass",31);
		}catch(Exception e){
			Utility.writeResult("Fail",31);
			Log.info("test_eTOMAssessment2: Element not found error");
		}

		try{
			Log.info("test_eTOMAssessment2: Option 2 checked");
			driver.findElement(By.xpath(object.getProperty("op1"))).click();
			Log.info("test_eTOMAssessment2: Option 3 checked");
			driver.findElement(By.xpath(object.getProperty("op2"))).click();
			Log.info("test_eTOMAssessment2: Option 4 checked");
			driver.findElement(By.xpath(object.getProperty("op3"))).click();
			Log.info("test_eTOMAssessment2: Option 5 checked");
			driver.findElement(By.xpath(object.getProperty("op4"))).click();
			Log.info("test_eTOMAssessment2: Option 6 checked");
			driver.findElement(By.xpath(object.getProperty("op5"))).click();
			Utility.getscreenshot("eTOMAssessment2_Check.jpg");
			//uncheck
			Log.info("test_eTOMAssessment2: Option 2 unchecked");
			driver.findElement(By.xpath(object.getProperty("op1"))).click();
			Log.info("test_eTOMAssessment2: Option 3 unchecked");
			driver.findElement(By.xpath(object.getProperty("op2"))).click();
			Log.info("test_eTOMAssessment2: Option 3 unchecked");
			driver.findElement(By.xpath(object.getProperty("op3"))).click();
			Log.info("test_eTOMAssessment2: Option 4 unchecked");
			driver.findElement(By.xpath(object.getProperty("op4"))).click();
			Log.info("test_eTOMAssessment2: Option 5 unchecked");
			driver.findElement(By.xpath(object.getProperty("op5"))).click();
			Utility.getscreenshot("eTOMAssessment2_Uncheck.jpg");
			Utility.writeResult("Pass",32);
		}catch(Exception e){
			Utility.writeResult("Fail",32);
			Log.info("test_eTOMAssessment2: Element not found error");
		}
		
		try{
			Log.info("test_eTOMAssessment2: Clicking Submit");
			driver.findElement(By.xpath(object.getProperty("submit"))).click();
			Log.info("test_eTOMAssessment2: Switch to Default Frame");
			Utility.getscreenshot("eTOMAssessment2_submit.jpg");
			driver.switchTo().defaultContent();
			Utility.writeResult("Pass",33);
		}catch(Exception e){
			Utility.writeResult("Fail",33);
			Log.info("test_eTOMAssessment2: Element not found error");
		}

		
		Log.info("--------------test_eTOMAssessment2 DONE------------------");

	}

}
