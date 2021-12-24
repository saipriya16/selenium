package hcll.testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadfile {




@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/download.html");
	d1.findElement(By.linkText("Download Excel")).click();
	File filelocation=new File("C:\\Users\\riyan\\Downloads");
	File[] totalfiles=filelocation.listFiles();
	for(File ff:totalfiles) {
		if(ff.getName().equalsIgnoreCase("testleaf .xlsx")) {
			System.out.println("File download successfully");
			break;
		}
	}

}
}