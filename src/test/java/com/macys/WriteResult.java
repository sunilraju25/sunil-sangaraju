package com.macys;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteResult {
	
	
	public static void writeData(String filepath,String pagename,String result) throws IOException, WriteException, BiffException{

		Workbook workbook = null;
		workbook = Workbook.getWorkbook(new File(filepath));
		WritableWorkbook writableWorkbook1 = Workbook.createWorkbook(new File(filepath), workbook);
		WritableSheet ws  = writableWorkbook1.getSheet("Sheet1");
		Sheet s = workbook.getSheet("Sheet1");
	    Cell col = s.findCell("TestResult");
	    int resultCol = col.getColumn();
	    Cell page = s.findCell(pagename);
	    int pageRow = page.getRow();
		Label label = new Label(resultCol, pageRow, result);
		try {
			ws.addCell(label);
		} catch (WriteException e) {

			e.printStackTrace();
		}
		
		
		writableWorkbook1.write();
		writableWorkbook1.close();
	}

	public static void writelinkcompareresult(String filepath,String link,String pagename,String sourceURL,String destURL,int row,String result) throws IOException, WriteException, BiffException{
		Workbook workbook = null;
		WritableSheet ws;
		
		workbook = Workbook.getWorkbook(new File(filepath));
		Sheet[] totalsheets = workbook.getSheets();
		int sheet_count = totalsheets.length; 	
		String[] sheet_names = workbook.getSheetNames();
		WritableWorkbook writableWorkbook1 = Workbook.createWorkbook(new File(filepath), workbook);
		String s=" ";
		for(String sheet:sheet_names){
			if(sheet.equals(pagename)){
				s=sheet;
			}		
		}
		
		if(s.equals(pagename)){
			ws  = writableWorkbook1.getSheet(pagename);
		}
		else{
			ws  = writableWorkbook1.createSheet(pagename, sheet_count);	
		}
		
		Label linktext = new Label(0, row, link);
		Label source = new Label(1, row, sourceURL);
		Label dest = new Label(2, row, destURL);
		Label testresult = new Label(3,row,result);
		ws.setColumnView(0, link.length());
		ws.setColumnView(1, sourceURL.length());
		ws.setColumnView(2, destURL.length());
		ws.setColumnView(3, result.length());
		
		
		try {
			ws.addCell(linktext);
			ws.addCell(source);
			ws.addCell(dest);
			ws.addCell(testresult);
			Log.info("Writing " +link+ " in Excel");
			
		} catch (WriteException e) {

			e.printStackTrace();
		}
		
		
		writableWorkbook1.write();
		writableWorkbook1.close();
	}

	/*public void removesheet(String pagename) throws IOException, BiffException{
		Workbook workbook = null;
		workbook = Workbook.getWorkbook(new File(filepath));
		
		WritableWorkbook writableWorkbook1 = Workbook.createWorkbook(new File(filepath), workbook);
		String[] sheet_names = workbook.getSheetNames();
		
		for(int i=0;i<sheet_names.length;i++){
			if(sheet_names.equals(pagename)){
				writableWorkbook1.removeSheet(i);
			}
		}
		
	}*/
	
	
}
