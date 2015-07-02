package com.etiam.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExl {
	public static ArrayList <String> readExcelfile(String cellValue) throws IOException, InvalidFormatException{

		ArrayList <String> al = new ArrayList <String>();
		try {
		FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"//src//com//etiam//data//Validation.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (file);
		//org.apache.poi.ss.usermodel.Workbook workbook= WorkbookFactory.create(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		//org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
            Row row = rowIterator.next();
                      
             
            //For each row, iterate through each columns
            Iterator <Cell> cellIterator = row.cellIterator();
            if(row.getCell(0).getStringCellValue().equals(cellValue)){
            while(cellIterator.hasNext()) {
                 
                Cell cell = cellIterator.next();
                //System.out.println(cell.getColumnIndex()); 
                switch(cell.getCellType()) {
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        //al.add((cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t"); 
                        double val = cell.getNumericCellValue();
                        al.add(""+val);
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        al.add(cell.getStringCellValue());
                        break;
                }
            }}
            System.out.println("");
        }
		
        file.close();
        FileOutputStream out = 
            new FileOutputStream(new File(System.getProperty("user.dir")+"//src//com//etiam//data//Validation.xlsx"));
        workbook.write(out);
        out.close();
        
        
         
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
		return al;
		
	}
}
