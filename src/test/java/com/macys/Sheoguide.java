package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sheoguide extends CommonMethods {
	
	
static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\shoeguide.xls";
	
	static String Sheoguide_comfort_shoes_and_brands = "comfort_shoes_and_brands";
	static String Sheoguide_index = "index";
	static String Sheoguide_juniors_shoes = "juniors_shoes";
	static String Sheoguide_comfort_shoe_care = "shoe_care";
	static String Sheoguide_comfort_shoe_size_and_width = "shoe_size_and_width";
	static String Sheoguide_sore_feet_treatment = "sore_feet_treatment";
	static String Sheoguide_special_occasion_shoes = "special_occasion_shoes";
	static String Sheoguide_top_brands = "top_brands";
	static String Sheoguide_top_five_flats = "top_five_flats";
	static String Sheoguide_top_five_sandals = "top_five_sandals";
	static String Sheoguide_comfort_top_four_pumps = "top_four_pumps";
	static String Sheoguide_comfort_top_our_sneakers = "top_our_sneakers";
	static String Sheoguide_comfort_top_nine_boots = "top_nine_boots";
	static String Sheoguide_comfort_top_seven_booties = "top_seven_booties";
	
	static Sheoguide SG;
	
  public Sheoguide(String filepath) {
		super(filepath);
	}

  
   
  @BeforeTest
  public static void beforeClass1() {
	  
	  SG = new Sheoguide(filepath);
	  SG.open_browser();
  }
  
  @AfterTest
  public static void afterClass(){
	  
	  SG.close_browser();
  }

	
  @Test
  public static void comfortShoesAndBrands() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_shoes_and_brands);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  @Test
  public static void index() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_index);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void juniorsShoes() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_juniors_shoes);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void shoeCare() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_shoe_care);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void shoeSizeAndWidth() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_shoe_size_and_width);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void soreFeetTreatment() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_sore_feet_treatment);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void specialOccasionShoes() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_special_occasion_shoes);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topBrands() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_top_brands);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topFiveFlats() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_top_five_flats);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topFiveSandals() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_top_five_sandals);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topFourPumps() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_top_four_pumps);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topOurSneakers() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_top_our_sneakers);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topNineBoots() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_top_nine_boots);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  
  @Test
  public static void topSevenBooties() throws WriteException, BiffException, InterruptedException, IOException{
	  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,Sheoguide_comfort_top_seven_booties);
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
      
      Assert.assertTrue(SG.metavalidation(testdata));
      Log.info("Validation completed for Meta Discription");
  }

  


}
