package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WatchesGuide extends CommonMethods {
	
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\WatchesGuide.xls";
	
	static String WatchesGuide_best_watches_for_men = "best_watches_for_men";
	static String WatchesGuide_best_watches_for_women = "best_watches_for_women";
	static String WatchesGuide_howtocareforyourwatch = "howtocareforyourwatch";
	static String WatchesGuide_howtomatchyourwatchwithyourwardrobe = "howtomatchyourwatchwithyourwardrobe";
	static String WatchesGuide_index = "index";
	static String WatchesGuide_top_brands = "top_brands";
	static String WatchesGuide_watch_movement_types = "watch_movement_types";
	static String WatchesGuide_watch_sizes_and_fit = "watch_sizes_and_fit";
	static String WatchesGuide_watch_trends = "watch_trends";
	
	static WatchesGuide WG;
	
	  public WatchesGuide(String filepath) {
			super(filepath);
		}

	    
	  @BeforeTest
	  public static void beforeClass1() {
		  
		  WG = new WatchesGuide(filepath);
		  WG.open_browser();
	  }
	  
	  @AfterTest
	  public static void afterClass(){
		  
		  WG.close_browser();
	  }

	  @Test
	  public static void bestWatchesForMen() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_best_watches_for_men);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

	  @Test
	  public static void bestWatchesForWomen() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_best_watches_for_women);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void howtoCareForYourWatch() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_howtocareforyourwatch);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void howtoMatchYourWatchwithYourWardrobe() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_howtomatchyourwatchwithyourwardrobe);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void index() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_index);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void topBrands() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_top_brands);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void watchMovementTypes() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_watch_movement_types);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void watchSizesAndFit() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_watch_sizes_and_fit);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void watchTrends() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,WatchesGuide_watch_trends);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(WG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(WG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(WG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(WG.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(WG.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      WG.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(WG.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }

}
