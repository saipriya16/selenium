package hcll.testng;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class datadriven {
@Test
    
	public  void method() throws BiffException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
  Workbook w1=Workbook.getWorkbook(new File("C:\\Users\\riyan\\Documents\\saipriyasheet1.xls"));
  Sheet s1=w1.getSheet(0);
  for(int i=1;i<s1.getRows();i++) {
	  String username=s1.getCell(0, i).getContents();
	  d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	  d1.findElement(By.id("ap_email")).sendKeys(username);
	  d1.findElement(By.id("continue")).click();
	  
  }
  

}
}
