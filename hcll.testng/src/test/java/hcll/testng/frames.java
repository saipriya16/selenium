package hcll.testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class frames {
@Test
    
	public  void method() throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Frames.html");
	d1.switchTo().frame(0);
	d1.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
	Thread.sleep(2000);
	//WebDriverWait wait = new WebDriverWait(d1,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")));
	d1.switchTo().defaultContent();
	d1.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	d1.switchTo().frame(1);
	WebElement obj=d1.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div/iframe"));

	
	d1.switchTo().frame(obj);
	d1.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	d1.switchTo().parentFrame();
	TakesScreenshot screen=(TakesScreenshot)d1;
	File Source=screen.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\riyan\\Documents\\saipriya\\screenshort1");
	FileHandler.copy(Source,destination);
	
	

}
}
