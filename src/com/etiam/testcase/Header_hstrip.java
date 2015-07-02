package com.etiam.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.etiam.core.Log;
import com.etiam.core.TestCore;
import com.etiam.utility.Utility;

public class Header_hstrip extends TestCore {
	
	@Test	
	public void test_ExitCourseButton() throws Exception{	
		
			
		
		Log.info("--------------test_ExitCourseButton START------------------");
		Log.info("test_ExitCourseButton: Test Close button");
		try{
	      driver.findElement(By.xpath(object.getProperty("close"))).click();
	      Utility.writeResult("Pass",1);
	      Utility.implicitWait(2);
	      Utility.getscreenshot("ExitCourseButton_frame.jpg");
		}catch(Exception e){
			Utility.writeResult("Fail",1);
			Log.info("test_ExitCourseButton: Element not found error");
		}
	      try{
	    	  driver.findElement(By.xpath(object.getProperty("close_1"))).click();
		      Utility.writeResult("Pass",2);
		      Log.info("test_ExitCourseButton: Close working Fine");
		      Log.info("--------------test_ExitCourseButton DONE------------------");
	      }catch(Exception e){
	    	  Utility.writeResult("Fail",2);
	    	  Log.info("test_ExitCourseButton: Element not found error");
	      }  		

	}
	
	@Test
	public void test_HelpLink() throws Exception{
		Log.info("--------------test_HelpLink START------------------");
		Log.info("test_HelpLink: Test Help button");
		try{
			driver.findElement(By.xpath(object.getProperty("help"))).click();
			Utility.getscreenshot("HelpLink_frame.jpg");
			Utility.writeResult("Pass",3);
		}catch(Exception e){
	    	  Utility.writeResult("Fail",3);
	    	  Log.info("test_HelpLink: Element not found error");
	      }
		try{
			driver.findElement(By.xpath(object.getProperty("help_1"))).click();	
			Log.info("test_HelpLink: Help working fine");
			Utility.writeResult("Pass",4);
		}catch(Exception e){
	    	  Utility.writeResult("Fail",4);
	    	  Log.info("test_HelpLink: Element not found error");
	      }
		
		Log.info("--------------test_HelpLink DONE------------------");
	}
	
	@Test
	public void test_GlossaryLink() throws Exception{
		Log.info("--------------test_GlossaryLink START------------------");
		Log.info("test_GlossaryLink: Test Glossary");
		try{
			driver.findElement(By.xpath(object.getProperty("glosary"))).click();
			Utility.getscreenshot("GlossaryLink_frame.jpg");
			Utility.writeResult("Pass",5);
		}catch(Exception e){
	    	  Utility.writeResult("Fail",5);
	    	  Log.info("test_GlossaryLink: Element not found error");
	      }
		try{
			driver.findElement(By.xpath(object.getProperty("glosary_1"))).click();
			Log.info("test_GlossaryLink: Glossary is working fine");
			Utility.writeResult("Pass",6);
		}catch(Exception e){
	    	  Utility.writeResult("Fail",6);
	    	  Log.info("test_GlossaryLink: Element not found error");
	      }
		
		Log.info("--------------test_GlossaryLink DONE------------------");
	}
	
	@Test
	public void test_DownloadPDF() throws Exception{	
		Log.info("--------------test_DownloadPDF START------------------");
		Log.info("test_DownloadPDF: DownloadPDF");
		try{
			driver.findElement(By.xpath(object.getProperty("download"))).click();
			Log.info("test_DownloadPDF: Working Fine");
			Utility.writeResult("Pass",7);
		}catch(Exception e){
	    	  Utility.writeResult("Fail",7);
	    	  Log.info("test_DownloadPDF: Element not found error");
	      }
		
		Log.info("--------------test_DownloadPDF DONE------------------");
	}

}
