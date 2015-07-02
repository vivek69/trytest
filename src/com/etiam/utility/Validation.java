package com.etiam.utility;

import java.io.File;

import org.openqa.selenium.WebElement;

import com.etiam.core.Log;
import com.etiam.core.TestCore;

public class Validation extends TestCore{

	private  String Color_Code;
	private  String display;
	private  String font_size;
	private  String height;
	private  String width;
	private  String cursor;
	private  String text_decoration; 
	private  String font_family;
	private  String font_style;
	private  String font_weight;
	private WebElement e;
	
	//Constructor
	public Validation(WebElement e,int j) throws Exception{
		this.e=e;
		int i=0;
		switch(j){
		case 1 : i=j;
		break;
		case 2 : i=j;
		break;
		case 3 : i=j;
		break;
		
		}
		
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"//src//com//etiam//data//Validation.xlsx", "CSS");
		
		System.out.println();
		Color_Code= ExcelUtils.getCellData(i,1);
		
		display= ExcelUtils.getCellData(i,2);
		font_size= ExcelUtils.getCellData(i,3);
		height= ExcelUtils.getCellData(i,4);
		width= ExcelUtils.getCellData(i,5);
		cursor= ExcelUtils.getCellData(i,6);
		text_decoration= ExcelUtils.getCellData(i,7);
		font_family= ExcelUtils.getCellData(i,8);
		font_style= ExcelUtils.getCellData(i,9);
		font_weight= ExcelUtils.getCellData(i,10);		
	}
	
	//Validate Color
	private boolean testColor_Code(String Color_Code1){

		if (Color_Code1.equals(Color_Code)){
			Log.info("CSS Validation: Color code PASS");
			return true;
		}else{
			Log.info("CSS Validation: Color code FAIL");
			return false;
		}

	}

	//Validate Display
	private  boolean testDisplay(String display1){

		if (display.equals(display)){
			Log.info("CSS Validation: display PASS");
			return true;
		}else{
			Log.info("CSS Validation: display FAIL");
			return false;
		}
	}

	//Validate font-size
	private  boolean testFont_size(String font_size1){
		if (font_size.equals(font_size)){
			Log.info("CSS Validation: font-size PASS");
			return true;
		}else{
			Log.info("CSS Validation: font-size FAIL");
			return false;
		}
	}

	//Validate height
	private boolean testHeight(String height1){

		if (height1.equals(height)){
			Log.info("CSS Validation: height PASS");
			return true;
		}else{
			Log.info("CSS Validation: height FAIL");
			return false;
		}
	}

	//Validate width
	private boolean testWidth(String width1){

		if (width1.equals(width)){
			Log.info("CSS Validation: width PASS");
			return true;
		}else{
			Log.info("CSS Validation: width FAIL");
			return false;
		}

	}
	
	//Validate cursor
	private boolean testCursor(String cursor1){
		if (cursor1.equals(cursor)){
			Log.info("CSS Validation: cursor PASS");
			return true;
		}else{
			Log.info("CSS Validation: cursor FAIL");
			return false;
		}

	}
	
	//Validate text-decoration
	private boolean text_Decoration(String text_decoration1){

		if (text_decoration1.equals(text_decoration)){
			Log.info("CSS Validation: text-decoration PASS");
			return true;
		}else{
			Log.info("CSS Validation: text-decoration FAIL");
			return false;
		}
	}

	//Validate font-family
	private boolean testFont_family(String font_family1){

		if (font_family1.equals(font_family)){
			Log.info("CSS Validation: font-family PASS");
			return true;
		}else{
			Log.info("CSS Validation: font-family FAIL");
			return false;
		}

	}

	//Validate font-style
	private boolean testFont_style(String font_style1){

		if (font_style1.equals(font_style)){
			Log.info("CSS Validation: font-style PASS");
			return true;
		}else{
			Log.info("CSS Validation: font-style FAIL");
			return false;
		}
	}

	//Validate font-weight
	private boolean testFont_weight(String font_weight1){

		if (font_weight1.equals(font_weight)){
			Log.info("CSS Validation: font-weight PASS");
			return true;
		}else{
			Log.info("CSS Validation: font-weight FAIL");
			return false;
		}

	}
	
	
	
	public void validate() throws Exception{
		Log.info("---------------Validating CSS--------------");
		String s1=Utility.colorCode(e.getCssValue("color"));
		if(testColor_Code(s1)==false){
			Log.info("CSS Validation: Color code should be "+Color_Code);
		}
		
		if(testDisplay(e.getCssValue("display"))==false){
			Log.info("CSS Validation: display should be "+display);
		}

		
		if(testFont_size(e.getCssValue("font-size"))==false){
			Log.info("CSS Validation: font-size should be "+font_size);
		}

		
		if(testHeight(e.getCssValue("height"))==false){
			Log.info("CSS Validation: height should be "+height);
		}

		
		if(testWidth(e.getCssValue("width"))==false){
			Log.info("CSS Validation: width should be "+width);
		}

		
		if(testCursor(e.getCssValue("cursor"))==false){
			Log.info("CSS Validation: cursor should be "+cursor);
		}

		
		if(text_Decoration(e.getCssValue("text-decoration"))==false){
			Log.info("CSS Validation: text-decoration be "+text_decoration);
		}
		
		if(testFont_family(e.getCssValue("font-family"))==false){
			Log.info("CSS Validation: font-family should be "+font_family);
		}
		
		if(testFont_style(e.getCssValue("font-style"))==false){
			Log.info("CSS Validation: font-style should be "+font_style);
		}
		
		if(testFont_weight(e.getCssValue("font-weight"))==false){
			Log.info("CSS Validation: font-weight should be "+font_weight);
		}
		Log.info("---------------CSS Validation Completed --------------");
		//return flag;
	}

}
