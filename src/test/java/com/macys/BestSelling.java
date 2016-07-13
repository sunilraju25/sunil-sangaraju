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


public class BestSelling extends CommonMethods {
	
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\best-selling.xls";	
	static String best_selling_index_page = "best-selling-index";
	static String best_selling_bronzers ="best-selling-bronzers";
	static String best_selling_ccs = "best-selling-ccs";
	static String best_selling_concealers ="best-selling-concealers";
	static String best_selling_eyebrow ="best-selling-eyebrow-pencils";
	static String best_selling_eyelash_curlers ="best-selling-eyelash-curlers";
	static String best_selling_eyeliners ="best-selling-eyeliners";
	static String best_selling_foundations ="best-selling-foundations";
	static String best_selling_foundations_dry_skin ="best-selling-foundations-for-dry-skin";
	static String best_selling_foundations_oily_skin ="best-selling-foundations-for-oily-skin";
	static String best_selling_lipsticks ="best-selling-lipsticks";
	static String best_selling_makeup_brushes ="best-selling-makeup-brushes";
	static String best_selling_mascaras ="best-selling-mascaras";
	static String best_selling_primers ="best-selling-primers";

	
	static BestSelling BS;
	
  public BestSelling(String filepath) {
		super(filepath);
	}

    
  @BeforeTest
  public static void beforeClass1() {
	  
	  BS = new BestSelling(filepath);
	  BS.open_browser();
  }
  
  @AfterTest
  public static void afterClass(){
	  
	  BS.close_browser();
  }

  
  @Test
  public static void best_selling_index_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_index_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }
  
  @Test
  public static void best_selling_bronzers() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_bronzers);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_ccs() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_ccs);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_concealers() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_concealers);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_eyebrow() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_eyebrow);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_eyelash_curlers() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_eyelash_curlers);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_eyeliners() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_eyeliners);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_foundations() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_foundations);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_foundations_dry_skin() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_foundations_dry_skin);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_foundations_oily_skin() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_foundations_oily_skin);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_lipsticks() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_lipsticks);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_makeup_brushes() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_makeup_brushes);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

  @Test
  public static void best_selling_mascaras() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_mascaras);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }
  
  @Test
  public static void best_selling_primers() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_selling_primers);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(BS.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(BS.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(BS.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(BS.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(BS.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  BS.getlinksfrompage(testdata);
  }

}
