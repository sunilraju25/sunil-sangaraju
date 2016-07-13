package com.macys;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class ReadDataFromExcel {
	
	static String sheetName = "Sheet1";
	
	
	public static List<String> readdatafromexcel(String filepath,String page)
			throws InterruptedException, WriteException, IOException, BiffException {

		int startrow = 0, startcol = 0;
		ArrayList<String> pageDetail = new ArrayList<String>();
		Workbook workbook = null;
		workbook = Workbook.getWorkbook(new File(filepath));
		Sheet sheet = workbook.getSheet(sheetName);
		Cell tableStart = sheet.findCell(page);
		startrow = tableStart.getRow();
		startcol = tableStart.getColumn();

		for (int count = startcol; count < 7; count++) {
			pageDetail.add(sheet.getCell(count, startrow).getContents());
		}
		Log.info("Getting data from Excel");
		Log.info("Pagename:" + pageDetail.get(0) + "\n" + "Legacy URL:"
				+ pageDetail.get(1) + "\n" + "Heroku URL:" + pageDetail.get(2));
		
		return pageDetail;

	}

	public static ArrayList<ArrayList<String>> readalldata(String filepath) throws InterruptedException, BiffException, IOException {
		String data = "";
		Workbook workbook = null;
		workbook = Workbook.getWorkbook(new File(filepath));
		Sheet sheet = workbook.getSheet(sheetName);
		ArrayList<String> pageDetails = new ArrayList<String>();
		ArrayList<ArrayList<String>> allPages = new ArrayList<ArrayList<String>>();
		for (int row_count = 1; row_count < sheet.getRows(); row_count++) {
			for (int col_count = 0; col_count < sheet.getColumns(); col_count++) {
				data = sheet.getCell(col_count, row_count).getContents();
				pageDetails.add(data);
			}

			ArrayList<String> page = new ArrayList<String>();
			for (String s : pageDetails) {
				page.add(s);
			}

			allPages.add(page);
			pageDetails.clear();

		}
		return allPages;
}

}
