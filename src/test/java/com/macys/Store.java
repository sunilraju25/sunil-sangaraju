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

public class Store extends CommonMethods {
   
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\Store.xls";
	
	static String a_gentlemans_guide_to_style_page = "a-gentlemans-guide-to-style";
	static String college_page = "college";
	static String coupon_deals_page = "coupon-deals";
	static String diamond_finder_page = "diamond-finder";
	static String dress_finder_page = "dress-finder";
	static String fragrance_finder_page = "fragrance_finder";
	static String gift_guide_page = "gift-guide";
	static String watch_buying_guide_page = "watch-buying-guide";
	
	static Store ST;
	
  public Store(String filepath) {
	  super(filepath);
	}
  
  
  @BeforeTest
  public static void beforeClass1() {
	  
	  ST = new Store(filepath);
	  ST.open_browser();
  }

  @AfterTest
  public static void afterClass(){
	  
	  ST.close_browser();
  }
  
  
  @Test
  public static void a_gentlemans_guide_to_style_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,a_gentlemans_guide_to_style_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
  
  @Test
  public static void college_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,college_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
 
  @Test
  public static void coupon_deals_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,coupon_deals_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void diamond_finder_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,diamond_finder_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
  
  @Test
  public static void dress_finder_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,dress_finder_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
  
  @Test
  public static void fragrance_finder_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,fragrance_finder_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
  
  
  @Test
  public static void gift_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,gift_guide_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
  
  @Test
  public static void watch_buying_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,watch_buying_guide_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(ST.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(ST.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(ST.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(ST.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(ST.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  ST.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(ST.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }
  
}
