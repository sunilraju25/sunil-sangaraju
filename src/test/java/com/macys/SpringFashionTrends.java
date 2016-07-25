package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpringFashionTrends extends CommonMethods {
	
    static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\SpringFashionTrends.xls";
	
	static String accessory_trends_page = "accessory-trends";
	static String dress_trends_page = "dress-trends";
    static String handbag_trends_page = "handbag-trends";
	static String index_page = "index";
	static String jewelry_trends_page = "jewelry-trends";
	static String lingerie_trends_page = "lingerie-trends";
	static String matched_sets_page = "matched-sets";
	static String one_piece_page = "one-piece";
	static String pant_trends_page = "pant-trends";
	static String shoe_trends_page = "shoe-trends";
	
	static SpringFashionTrends SFT;

	public SpringFashionTrends(String filepath) {
			super(filepath);
		}
	
	@BeforeTest
	public static void beforeClass1() {
			SFT = new SpringFashionTrends(filepath);
			SFT.open_browser();
	    }

	@AfterTest
	public static void afterClass(){ 
		  SFT.close_browser();
	    }

	@Test
	public static void accessory_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,accessory_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

	 
	@Test
	public static void dress_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,dress_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void handbag_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,handbag_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void index_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,index_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void jewelry_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,jewelry_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
		
	
	@Test
	public static void lingerie_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,lingerie_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void matched_sets_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,matched_sets_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void pant_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,pant_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void one_piece_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,one_piece_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

	@Test
	public static void shoe_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,shoe_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(SFT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(SFT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(SFT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(SFT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  SFT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(SFT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
}

