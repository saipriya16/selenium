package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Static.html");
	Actions act1=new Actions(d1);
	WebElement ele1=d1.findElement(By.xpath("//img[@id='angular']"));
	act1.dragAndDropBy(ele1, 80, 50).build().perform();
	WebElement ele2=d1.findElement(By.xpath("//img[@id='mongo']"));
	act1.dragAndDropBy(ele2, 180, 150).build().perform();
	WebElement ele3=d1.findElement(By.xpath("//img[@id='node']"));
	act1.dragAndDropBy(ele3, 120, 130).build().perform();
	d1.close();
	
	

}
@Test

public  void method1() throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver d1;
d1=new ChromeDriver();
d1.get("http://demo.automationtesting.in/Dynamic.html");
Actions act2=new Actions(d1);
WebElement ele1=d1.findElement(By.xpath("//img[@id='angular']"));
act2.dragAndDropBy(ele1, 80, 50).build().perform();
WebElement ele2=d1.findElement(By.xpath("//img[@id='mongo']"));
act2.dragAndDropBy(ele2, 90, 23).build().perform();
WebElement ele3=d1.findElement(By.xpath("//img[@id='node']"));
act2.dragAndDropBy(ele3, 70, 20).build().perform();






}
}
