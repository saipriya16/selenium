package hcll.testng;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class oderedlist {
	@Test

	public  void method1() throws IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Selectable.html");
	List<WebElement> ele1=d1.findElements(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li"));
	System.out.println(ele1.size());
	Actions act1=new Actions(d1);
	act1.keyDown(Keys.CONTROL);
	act1.click(ele1.get(0)).perform();
	act1.click(ele1.get(1)).perform();
	//.click(ele1.get(3));
	TakesScreenshot screen=(TakesScreenshot)d1;
	File Source=screen.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\riyan\\Documents\\saipriya\\screenshort1.png");
	FileHandler.copy(Source,destination);
	
	
	
	

}
}