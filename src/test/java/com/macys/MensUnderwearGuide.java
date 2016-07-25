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

public class MensUnderwearGuide extends CommonMethods {
	
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\MensUnderwearGuide.xls";

	static String boxers_or_briefs_page = "boxers-or-briefs";
	static String index_page = "index";
	static String mens_performance_underwear_guide_page = "mens-performance-underwear-guide";
	static String mens_shapewear_guide_page = "mens-shapewear-guide";
	static String mens_sock_guide_page = "mens-sock-guide";
	static String mens_undershirt_guide_page = "mens-undershirt-guide";
	static String mens_underwear_brands_page = "mens-underwear-brands";
	static String mens_underwear_care_faq_page = "mens-underwear-care-faq";
	static String mens_underwear_fit_fabric_guide_page = "mens-underwear-fit-fabric-guide";
	static String mens_underwear_style_guide_page = "mens-underwear-style-guide";
	
	static MensUnderwearGuide MUG;

	public MensUnderwearGuide(String filepath) {
			super(filepath);
		}
	
	@BeforeTest
	public static void beforeClass1() {
			MUG = new MensUnderwearGuide(filepath);
			MUG.open_browser();
	    }
	
	@AfterTest
	public static void afterClass(){ 
		  MUG.close_browser();
	    }
	
	@Test
	public static void boxers_or_briefs_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,boxers_or_briefs_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void index_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,index_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void mens_performance_underwear_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_performance_underwear_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void mens_shapewear_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_shapewear_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void mens_sock_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_sock_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void mens_undershirt_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_undershirt_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void mens_underwear_brands_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_underwear_brands_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void mens_underwear_care_faq_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_underwear_care_faq_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	
	@Test
	public static void mens_underwear_fit_fabric_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_underwear_fit_fabric_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	
	@Test
	public static void mens_underwear_style_guide_page() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,mens_underwear_style_guide_page);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(MUG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(MUG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(MUG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(MUG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
		  MUG.getlinksfrompage(testdata);
		  
		  Assert.assertTrue(MUG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
}
