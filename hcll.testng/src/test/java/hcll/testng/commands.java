package hcll.testng;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class commands {
@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Windows.html");
	System.out.println(d1.getTitle());
	System.out.println(d1.getCurrentUrl());
	System.out.println(d1.getPageSource());
	d1.navigate().back();
	d1.navigate().forward();
	d1.navigate().refresh();
	d1.navigate().to("http://leafground.com/pages/Edit.html");
	d1.manage().window().maximize();
	Dimension w=new Dimension(300,350);
	d1.manage().window().setSize(w);
	d1.close();
	d1.quit();
	

}
}
