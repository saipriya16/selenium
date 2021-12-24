package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alerts {
@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/Alert.html");
	WebDriverWait wait = new WebDriverWait(d1,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='normalAlert()']")));
		d1.findElement(By.id("yes")).click();
	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	d1.switchTo().alert().getText();
	d1.switchTo().alert().accept();
	d1.findElement(By.xpath("//button[@onclick='confrimAlert()']")).click();
	d1.switchTo().alert().dismiss();
	d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	d1.switchTo().alert().sendKeys("hiii");
	d1.switchTo().alert().accept();
	
	
	
	
	
	
}
}
