package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Campaigns extends CommonMethods{	


		static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\campaigns1.xls";
		
		static String Campaigns_storelocator = "storelocator";
		static String Campaigns_macyslists = "macyslists";
		static String Campaigns_martha = "martha";
		static String Campaigns_mattressfinder = "mattressfinder";
		static String Campaigns_michaelkors = "michaelkors";
		static String Campaigns_philosophy = "philosophy";
		static String Campaigns_diningtrends = "diningtrends";
		static String Campaigns_dyson = "dyson";
		static String Campaigns_finders = "finders";
		static String Campaigns_graco = "graco";
		static String Campaigns_henckels = "henckels";
		static String Campaigns_kidsshoes = "kidsshoes";
		static String Campaigns_levisfitfinderforboys = "levisfitfinderforboys";
		static String Campaigns_levisfitfinderforgirls = "levisfitfinderforgirls";
		static String Campaigns_levisfitfinderformen = "levisfitfinderformen";
		static String Campaigns_macys_app_for_windows = "macys_app_for_windows";
		static String Campaigns_must_have_accessories = "must_have_accessories";
		static String Campaigns_ralph_lauren_kids = "ralph_lauren_kids";
		static String Campaigns_ralph_lauren_presents_american_voices = "ralph_lauren_presents_american_voices";
		static String Campaigns_ralph_lauren_presents_project_warehouse = "ralph_lauren_presents_project_warehouse";
		static String Campaigns_the_world_of_ralph_lauren = "the_world_of_ralph_lauren";
		static String Campaigns_tommy_vanity = "tommy_vanity";
		static String Campaigns_trend_closet = "trend_closet";
		static String Campaigns_urban_decay_behind_the_brand = "urban_decay_behind_the_brand";
		static String Campaigns_urban_decay_store_locator = "urban_decay_store_locator";
		static String Campaigns_waterford_lismore_collection = "waterford_lismore_collection";
		static String Campaigns_waterford_signing_041315 = "waterford_signing_041315";
		static String Campaigns_tom_ford = "tom_ford";
		static Campaigns Cg;
		
		public Campaigns(String filepath) {
			super(filepath);
			
		}
			
				
	   
	  @BeforeTest
	  public static void beforeClass1() {
		  
		  Cg = new Campaigns(filepath);
		  Cg.open_browser();
	  }
	  
	  @AfterTest
	  public static void afterClass(){
		  
		  Cg.close_browser();
	  }

	  
	  @Test
	  public static void storelocator() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_storelocator);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  

	  @Test
	  public static void macyslists() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_macyslists);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  

	
	  @Test
	  public static void martha() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_martha);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  

	
	  @Test
	  public static void mattressfinder() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_mattressfinder);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void michaelkors() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_michaelkors);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void philosophy() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_philosophy);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void diningtrends() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_diningtrends);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	  }
	  
	  
	  @Test
	  public static void dyson() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_dyson);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void finders() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_finders);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void graco() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_graco);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void henckels() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_henckels);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void kidsshoes() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_kidsshoes);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void levisfitfinderforboys() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_levisfitfinderforboys);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void levisfitfinderforgirls() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_levisfitfinderforgirls);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void levisfitfinderformen() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_levisfitfinderformen);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void macys_app_for_windows() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_macys_app_for_windows);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void must_have_accessories() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_must_have_accessories);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void ralph_lauren_kids() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_ralph_lauren_kids);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void ralph_lauren_presents_american_voices() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_ralph_lauren_presents_american_voices);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  @Test
	  public static void ralph_lauren_presents_project_warehouse() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_ralph_lauren_presents_project_warehouse);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void the_world_of_ralph_lauren() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_the_world_of_ralph_lauren);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  @Test
	  public static void tommy_vanity() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_tommy_vanity);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void trend_closet() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_trend_closet);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void urban_decay_behind_the_brand() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_urban_decay_behind_the_brand);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void urban_decay_store_locator() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_urban_decay_store_locator);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void waterford_lismore_collection() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_waterford_lismore_collection);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void waterford_signing_041315() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_waterford_signing_041315);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void tom_ford() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Campaigns_tom_ford);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(Cg.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(Cg.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(Cg.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(Cg.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      Cg.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(Cg.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	 
}
