package com.macys;

import java.io.IOException;
import java.util.*;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class CommonMethods {
	
	WebDriver driver,driver1;
	String filepath;
	
	String metaDesc = "//meta[@name='description']";
	
	public CommonMethods(String filepath){
		this.filepath = filepath;
	}
	
	public void open_browser(){
		driver = new FirefoxDriver();
		driver1 = new FirefoxDriver();
		String log4j_file = System.getProperty("user.dir")+ "\\log4j.properties";
		PropertyConfigurator.configure(log4j_file);
	}
	
	public void close_browser(){
		driver.quit();
		driver1.quit();
	}
	
	public void getlinksfrompage(List<String> pagedetails)
			throws InterruptedException, WriteException, IOException, BiffException {

		String sourceURL = pagedetails.get(1);
		String destURL = pagedetails.get(2);
		String[] relative_url;
		HashMap<String, String> links = new HashMap<String, String>();
		driver.get(sourceURL);
		wait_for_page_load(1000);
		List<WebElement> sourcePageLinks = driver.findElements(By
				.xpath(pagedetails.get(3)));
		driver.manage().window().maximize();
		Log.info("Getting links from page");
		for (WebElement we : sourcePageLinks) {
			String linkpath = we.getAttribute("href");
			if(linkpath != null){
			if(we.getAttribute("href").contains(".com/m")){
			relative_url = we.getAttribute("href").split(".com/m");
			links.put(we.getText(), relative_url[1]);
			Log.info(relative_url[1]);
			}
			else if(we.getAttribute("href").contains(".com")){
				relative_url = we.getAttribute("href").split(".com");
				links.put(we.getText(), relative_url[1]);
				Log.info(relative_url[1]);
			}
			else{
				links.put(we.getText(), we.getAttribute("href"));
				Log.info(we.getAttribute("href"));
			}
			
				
		}}
        //driver.quit();
		compareURLwithdest(pagedetails, destURL, links);

	}

	public void wait_for_page_load(long s) throws InterruptedException {
		Thread.sleep(s);
	}

	public void compareURLwithdest(List<String> pagedetails, String destURL,
			HashMap<String, String> links) throws InterruptedException,
			WriteException, IOException, BiffException {
		int count = 0;
		driver1.get(destURL);
		wait_for_page_load(1000);
		driver1.manage().window().maximize();
		for (String key : links.keySet()) {
			String url = links.get(key);
			Log.info("key=>" + key + " value=>" + url);
			WebElement we = driver1.findElement(By.linkText(key));
			Thread.sleep(1000);
			String dest_url = we.getAttribute("href");
			if (dest_url.contains(url)) {
				WriteResult.writelinkcompareresult(filepath,key,pagedetails.get(0),
						dest_url, url, count, "Success");
				Log.info("Link rediretcion is success");
			} else {
				WriteResult.writelinkcompareresult(filepath,key,pagedetails.get(0),
						dest_url, url, count, "Fail");
				Log.info("Link redirection is not working");

			}
			count = count + 1;

			
		}
		/*for (String key : links.keySet()) {
			String url = links.get(key);
			Log.info("key=>" + key + " value=>" + url);
			driver1.findElement(By.linkText(key)).click();
			Thread.sleep(1000);
			if (driver1.getCurrentUrl().contains(url)) {
				WriteResult.writelinkcompareresult(filepath,key,pagedetails.get(0),
						driver1.getCurrentUrl(), url, count, "Success");
				Log.info("Link rediretcion is success");
			} else {
				WriteResult.writelinkcompareresult(filepath,key,pagedetails.get(0),
						driver1.getCurrentUrl(), url, count, "Fail");
				Log.info("Link redirection is not working");

			}
			count = count + 1;
			driver1.navigate().back();
			Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(driver1, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(key)));
		}*/
		//driver1.quit();
	}
	
	public Boolean pagetype_validation(String pageAttributes,String url,String value) throws InterruptedException{
		
		driver.get(url);
		driver.manage().window().maximize();
		wait_for_page_load(1000);
		String pageSource = driver.getPageSource();
		Log.info(pageAttributes+"\""+value+"\"");
		return pageSource.contains(pageAttributes+"\""+value+"\"");	
		
	}
	
	public Boolean comparehtml(List<String> testdata) throws InterruptedException{
		String xpath;
		driver.get(testdata.get(1));
		driver.manage().window().maximize();
		driver1.get(testdata.get(2));
		driver1.manage().window().maximize();
		Thread.sleep(1000);
		
		String url = testdata.get(1);
		String data[] = url.split("/");
		
		if (data[4].equals("mattress-buying-guide")){
			 xpath = "//div[@id='bd']//strong/..";
		}
		else if(data[4].equals("store")){
			xpath = "//div[@class='sectionCopy']";
		}
		else if (data[5].equals("2015-spring-fashion-trends")) {
			xpath="//div[@class='springfashion-sectionRow']";
		}
		
		else{
		   xpath = 	"//div[@id='bd']//p";
		}
	
				
		List<WebElement> allTextElement = driver.findElements(By.xpath(xpath));
		ArrayList<String> sourcePage = new ArrayList<String>();
		ArrayList<String> destPage = new ArrayList<String>();
		
		for(WebElement we:allTextElement){
			sourcePage.add(we.getText());
			
		}
		
		List<WebElement> destPage1 = driver1.findElements(By.xpath(xpath));
		
		for(WebElement we1:destPage1){
			destPage.add(we1.getText());			
		}
		
		Log.info("Legacy contents=>" + sourcePage);
		Log.info("Heroku contents=>" + destPage);
		
		if((sourcePage.isEmpty()) || (destPage.isEmpty())){
			Log.info("Please check the content/xpath of this page");
			return false;
		}
		else{
		   return sourcePage.equals(destPage);
		}
		
	}
	
	public Boolean metatitle(List<String> testdata) throws InterruptedException{
		String legacy_meta_title,heroku_meta_title;
		driver.get(testdata.get(1));
		driver.manage().window().maximize();
		wait_for_page_load(20);
		driver1.get(testdata.get(2));
		driver1.manage().window().maximize();
		wait_for_page_load(20);
		
		//legacy_meta_title = driver.getTitle();
		//heroku_meta_title = driver1.getTitle();
		
		legacy_meta_title = CheckSpecialchar(driver.getTitle());
		heroku_meta_title = CheckSpecialchar(driver1.getTitle());		
		Log.info("Legacy meta title => " + driver.getTitle());
		Log.info("Heroku meta title => " + driver1.getTitle());
		return legacy_meta_title.equals(heroku_meta_title);
		
	}
	
	public Boolean metavalidation(List<String> testdata) throws InterruptedException{
		driver.get(testdata.get(1));
		driver.manage().window().maximize();
		wait_for_page_load(20);
		driver1.get(testdata.get(2));
		driver1.manage().window().maximize();
		wait_for_page_load(20);
		String desc,source;
		
		if(isElementPresent(metaDesc)){
		   desc = driver.findElement(By.xpath(metaDesc)).getAttribute("Content");
		   source = driver1.findElement(By.xpath(metaDesc)).getAttribute("Content");		   
		   desc = CheckSpecialchar(desc);
		   source = CheckSpecialchar(source);
		   Log.info("Legacy meta description => " + desc);
		   Log.info("Heroku meta description => " + source);
		   return desc.equals(source);
		}
		else{
			Log.info("No meta description for this page");
			return true;
		}
				
	}
	
	public Boolean isElementPresent(String xpath){
		
		return driver.findElements(By.xpath(xpath)).size()>0;
	}
	
	public String CheckSpecialchar(String s){
		s = s.replaceAll("&#x27;","'");
		s = s.replaceAll("&amp;","&");
		return s;	
		
	}

}
