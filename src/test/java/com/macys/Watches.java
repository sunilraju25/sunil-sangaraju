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

public class Watches extends CommonMethods {
	
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\Watches.xls";
    
	static String best_watches_for_men_page = "best-watches-for-men";
	static String best_watches_for_women_page = "best-watches-for-women";
	static String how_to_care_for_your_watch_page = "how-to-care-for-your-watch";
	static String how_to_match_your_watch_with_your_wardrobe_page = "how-to-match-your-watch-with-your-wardrobe";
	static String index_page = "index";
	static String top_brands_page = "top-brands";
	static String watch_movement_types_page = "watch-movement-types";
	static String watch_sizes_and_fit_page = "watch-sizes-and-fit";
	static String watch_trends_page = "watch-trends";
	
	static Watches WAT;

	public Watches(String filepath) {
			super(filepath);
		}
	
	@BeforeTest
	public static void beforeClass1() {
			WAT = new Watches(filepath);
			WAT.open_browser();
	    }

	@AfterTest
	public static void afterClass(){ 
		  WAT.close_browser();
	    }
	
	@Test
	public static void best_watches_for_men_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_watches_for_men_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void best_watches_for_women_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_watches_for_women_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

	
	@Test
	public static void how_to_care_for_your_watch_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,how_to_care_for_your_watch_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void how_to_match_your_watch_with_your_wardrobe_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,how_to_match_your_watch_with_your_wardrobe_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void index_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,index_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void top_brands_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,top_brands_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
  
	
	
	@Test
	public static void watch_movement_types_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,watch_movement_types_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void watch_sizes_and_fit_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,watch_sizes_and_fit_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	
	@Test
	public static void watch_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,watch_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WAT.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WAT.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WAT.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WAT.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  WAT.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(WAT.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
}
