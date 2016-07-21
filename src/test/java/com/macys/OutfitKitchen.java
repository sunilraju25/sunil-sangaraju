package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.testng.Assert;
import org.testng.annotations.*;

public class OutfitKitchen extends CommonMethods {

	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\outfit.xls";	
	static String must_have_electrics = "must-have-electrics";
	static String order_in_the_kitchen  = "order-in-the-kitchen";
	static String setting_trends = "setting-trends";
	
	
	static OutfitKitchen OF;
	
  public OutfitKitchen(String filepath) {
		super(filepath);
	}

    
  @BeforeTest
  public static void beforeClass1() {
	  
	  OF = new OutfitKitchen(filepath);
	  OF.open_browser();
  }
  
  @AfterTest
  public static void afterClass(){
	  
	  OF.close_browser();
  }

  
  @Test
  public static void must_have_electrics() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,must_have_electrics);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(OF.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(OF.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(OF.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
             
      Log.info("reading the meta title");
      Assert.assertTrue(OF.metatitle(testdata));
      
      Log.info("Validating meta description and meta keywords...");
      Assert.assertTrue(OF.metavalidation(testdata));
      
      Log.info("Validating the links in the page...");		        
	  OF.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(OF.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
	  
	  Log.info("Comparing html contents...");
      Assert.assertTrue(OF.comparehtml(testdata));
      Log.info("Compare html-success");
  }
  
 /* @Test
  public static void order_in_the_kitchen() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,order_in_the_kitchen);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(OF.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(OF.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(OF.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
             
      Log.info("reading the meta title");
      Assert.assertTrue(OF.metatitle(testdata));
      
      Log.info("Validating meta description and meta keywords...");
      Assert.assertTrue(OF.metavalidation(testdata));
      
      Log.info("Validating the links in the page...");		        
	  OF.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(OF.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
	  
	  Log.info("Comparing html contents...");
      Assert.assertTrue(OF.comparehtml(testdata));
      Log.info("Compare html-success");
  }
  
  @Test
  public static void setting_trends() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,setting_trends);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(OF.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(OF.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(OF.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
             
      Log.info("reading the meta title");
      Assert.assertTrue(OF.metatitle(testdata));
      
      Log.info("Validating meta description and meta keywords...");
      Assert.assertTrue(OF.metavalidation(testdata));
      
      Log.info("Validating the links in the page...");		        
	  OF.getlinksfrompage(testdata);
	  
	  Assert.assertTrue(OF.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
	  
	  Log.info("Comparing html contents...");
      Assert.assertTrue(OF.comparehtml(testdata));
      Log.info("Compare html-success");
  }
  */

}
