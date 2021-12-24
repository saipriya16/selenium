package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class popupalerts {
@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Alerts.html");
	d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	//d1.switchTo().alert().getText();
	//Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(d1,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yes")));
	d1.switchTo().alert().accept();
	d1.close();
}
@Test
    
	public  void method1() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Alerts.html");
	d1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	d1.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Thread.sleep(3000);
	d1.switchTo().alert().accept();
	d1.close();
}
@Test

public  void method3()  {
System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver d1;
d1=new ChromeDriver();
d1.get("http://demo.automationtesting.in/Alerts.html");
d1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	d1.switchTo().alert().getText();
	d1.switchTo().alert().sendKeys("hello");
	d1.switchTo().alert().accept();
	
	
	
	
	
	
}
}


