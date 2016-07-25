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

public class MensSwimwear extends CommonMethods {
	
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\MensSwimwear.xls";
	
	static String beach_footwear_page = "beach-footwear";
	static String boys_swimwear_styles_and_trends_page = "boys-swimwear-styles-and-trends";
	static String index_page = "index";
	static String mens_swimwear_styles_and_trends_page = "mens-swimwear-styles-and-trends";
	static String pool_party_accessories_page = "pool-party-accessories";
	static String surf_inspired_styles_page = "surf-inspired-styles";
	
	static MensSwimwear MS;

	public MensSwimwear(String filepath) {
			super(filepath);
		}
	
	@BeforeTest
	public static void beforeClass1() {
			MS = new MensSwimwear(filepath);
			MS.open_browser();
	    }
	
	@AfterTest
	public static void afterClass(){ 
		  MS.close_browser();
	    }
	
	@Test
	public static void beach_footwear_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,beach_footwear_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

	
	@Test
	public static void boys_swimwear_styles_and_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,boys_swimwear_styles_and_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void index_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,index_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void mens_swimwear_styles_and_trends_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_swimwear_styles_and_trends_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void pool_party_accessories_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,pool_party_accessories_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void surf_inspired_styles_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,surf_inspired_styles_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MS.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MS.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MS.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MS.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
}
