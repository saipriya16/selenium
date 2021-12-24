package hcll.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class data1 {
@Test
    
	public  void method() throws IOException  {
	//System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1 = null;
	FileInputStream st=new FileInputStream("src\\test\\java\\sample\\config.properties");
	Properties prop=new Properties();
	prop.load(st);
	String browser=prop.getProperty("browser_name");
	String path=prop.getProperty("browser_path_name");
	if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", path);	
	
	d1=new ChromeDriver();}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", path);
	}
	else
	{
		System.setProperty("webdriver.ie.driver", path);
	}
	
FileInputStream f1=new FileInputStream("C:\\Users\\riyan\\Documents\\saipriyasheet1.xls");
XSSFWorkbook w1=new XSSFWorkbook(f1);
XSSFSheet s1=w1.getSheetAt(0);
for(int i=1;i<s1.getLastRowNum();i++) {
	XSSFRow r1=s1.getRow(i);
	String username = r1.getCell(0).getStringCellValue();
	d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	  d1.findElement(By.id("ap_email")).sendKeys(username);
	  d1.findElement(By.id("continue")).click();
	  
	
	
	
	
	
	
			
}








}
}
