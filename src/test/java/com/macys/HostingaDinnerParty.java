package com.macys;

import java.io.IOException;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HostingaDinnerParty extends CommonMethods{

	
	
static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\HDP.xls";
	
	static String HostingaDinnerParty_brands_we_love = "brands_we_love";
	static String HostingaDinnerParty_brunch_tea_party_ideas = "brunch_tea_party_ideas";
	static String HostingaDinnerParty_daytime_entertaining = "daytime_entertaining";
	static String HostingaDinnerParty_holiday_entertaining = "holiday_entertaining";
	static String HostingaDinnerParty_home_bar_basics = "home_bar_basics";
	static String HostingaDinnerParty_how_to_buy_dinnerware = "how_to_buy_dinnerware";
	static String HostingaDinnerParty_how_to_set_a_table = "how_to_set_a_table";
	static String HostingaDinnerParty_index = "index";
	static String HostingaDinnerParty_party_accessories = "party_accessories";
	static String HostingaDinnerParty_party_planning_checklist = "party_planning_checklist";
	static String HostingaDinnerParty_party_themes = "party_themes";
	static String HostingaDinnerParty_special_occasions = "special_occasions";
	static String HostingaDinnerParty_wedding_day_wows = "wedding_day_wows";
	
	static HostingaDinnerParty HDP;
	
	
	public HostingaDinnerParty(String filepath) {
		super(filepath);
		
	}
	
	@BeforeTest
	  public static void beforeClass1() {
		  
		HDP = new HostingaDinnerParty(filepath);
		HDP.open_browser();
	  }
	  
	  @AfterTest
	  public static void afterClass(){
		  
		  HDP.close_browser();
	  }
	
	  @Test
	  public static void brandsWeLove() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_brands_we_love);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	 
	  
	  @Test
	  public static void brunchTeaPartyIdeas() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_brunch_tea_party_ideas);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  
	  @Test
	  public static void daytimeEntertaining() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_daytime_entertaining);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	     
	  }
	  
	  
	  @Test
	  public static void holidayEntertaining() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_holiday_entertaining);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  @Test
	  public static void homeBarBasics() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_home_bar_basics);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void howToBuyDinnerware() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_how_to_buy_dinnerware);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void howToSetaTable() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_how_to_set_a_table);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  

	  
	  @Test
	  public static void index() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_index);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void partyAccessories() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_party_accessories);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void partyPlanningPchecklist() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_party_planning_checklist);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	  }
	  
	  
	  @Test
	  public static void partyThemes() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_party_themes);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void specialOccasions() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_special_occasions);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
	  
	  
	  @Test
	  public static void weddingDayWows() throws WriteException, BiffException, InterruptedException, IOException{
		  List<String> testdata = ReadDataFromExcel.readdatafromexcel(filepath,HostingaDinnerParty_wedding_day_wows);
		  Log.info("Starting Pagetype,PageID and Category ID validation...");
	      Assert.assertTrue(HDP.pagetype_validation("pageType:",testdata.get(2),testdata.get(4)), "Pagetype is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("pageId:",testdata.get(2),testdata.get(5)), "Pageid is not correct");
	      Assert.assertTrue(HDP.pagetype_validation("categoryID:",testdata.get(2),testdata.get(6)), "CategoryIdid is not correct");
	      Log.info("Pagetype,PageID and Category ID validation success...");
	      
	      Log.info("Comparing html contents...");
	      Assert.assertTrue(HDP.comparehtml(testdata));
	      Log.info("Compare html-success");
	      
	      Log.info("reading the meta title");
	      Assert.assertTrue(HDP.metatitle(testdata));
	      
	      Log.info("Validating the links in the page...");		        
	      HDP.getlinksfrompage(testdata);
	      
	      Assert.assertTrue(HDP.metavalidation(testdata));
	      Log.info("Validation completed for Meta Discription");
	  }
}
