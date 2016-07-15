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

public class Sunglasses extends CommonMethods {
	
    static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\Sunglasses.xls";
	
	static String best_sunglasses_for_women_page = "best-sunglasses-for-women";
	static String index_page = "index";
	static String kids_sunglasses_page = "kids-sunglasses";
	static String ray_ban_sunglasses_page = "ray-ban-sunglasses";
	static String sport_sunglasses_page = "sport-sunglasses";
	static String sunglasses_brands_page = "sunglasses-brands";
	static String sunglasses_by_face_shape_page = "sunglasses-by-face-shape";
	static String sunglass_lenses_page = "sunglass-lenses";
	static String what_are_polarized_sunglasses_page = "what-are-polarized-sunglasses";
	
	static Sunglasses SG;

  public Sunglasses(String filepath) {
		super(filepath);
	}
	

  @BeforeTest
  public static void beforeClass1() {
	  
	  SG = new Sunglasses(filepath);
	  SG.open_browser();
  }

  @AfterTest
  public static void afterClass(){
	  
	  SG.close_browser();
  }
   
  
  @Test
  public static void best_sunglasses_for_women_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,best_sunglasses_for_women_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }

  @Test
  public static void index_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,index_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }	
  
  
  @Test
  public static void kids_sunglasses_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,kids_sunglasses_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }	
  
  
  @Test
  public static void ray_ban_sunglasses_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,ray_ban_sunglasses_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }	
  
  
  @Test
  public static void sport_sunglasses_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,sport_sunglasses_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }	
  
  
  @Test
  public static void sunglasses_brands_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,sunglasses_brands_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }
  
  
  @Test
  public static void sunglasses_by_face_shape_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,sunglasses_by_face_shape_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }
  
  
  @Test
  public static void sunglass_lenses_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,sunglass_lenses_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }
  
  
  @Test
  public static void what_are_polarized_sunglasses_page() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,what_are_polarized_sunglasses_page);
	  Log.info("Starting Pagetype,PageID and Category ID validation...");
      Assert.assertTrue(SG.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
      Assert.assertTrue(SG.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
      Assert.assertTrue(SG.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
      Log.info("Pagetype,PageID and Category ID validation success...");
      
      Log.info("Comparing html contents...");
      Assert.assertTrue(SG.comparehtml(testdata));
      Log.info("Compare html-success");
      
      Log.info("reading the meta title");
      Assert.assertTrue(SG.metatitle(testdata));
      
      Log.info("Validating the links in the page...");		        
	  SG.getlinksfrompage(testdata);
  }
  
  
}
