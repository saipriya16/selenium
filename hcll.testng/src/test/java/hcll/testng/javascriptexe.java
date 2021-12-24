package hcll.testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptexe {
@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/");
	JavascriptExecutor js=(JavascriptExecutor) d1;
	String titleText =   js.executeScript("return document.title;").toString();
	System.out.println(titleText);
	String url=  js.executeScript("return document.URL;").toString();
	System.out.println(url);
	js.executeScript("history.go(0)");
	js.executeScript("document.getElementById('wrapper').click();");

	
	

}
}
