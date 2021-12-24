package hcll.testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowhandle {
@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Windows.html");
	String title1=d1.getTitle();
	d1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Set<String>window_value=d1.getWindowHandles();
	Iterator<String> iter=window_value.iterator();
	String w1=iter.next();
	String w2=iter.next();
	d1.switchTo().window(w2);
	
	
	String title2=d1.getTitle();
	System.out.println(title1);
	System.out.println(title2);
}
}
