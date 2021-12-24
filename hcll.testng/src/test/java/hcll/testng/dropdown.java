package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dropdown {
@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/Dropdown.html");
	WebDriverWait wait = new WebDriverWait(d1,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("dropdown2")));
	Select drop2=new Select(d1.findElement(By.name("dropdown2")));
	drop2.selectByIndex(2);
	Thread.sleep(3000);
	drop2.selectByValue("3");
	drop2.selectByVisibleText("Loadrunner");
	

}
@Test

public  void method1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver d1;
d1=new ChromeDriver();
d1.get("http://leafground.com/pages/Dropdown.html");
Select drop3=new Select(d1.findElement(By.name("dropdown3")));
drop3.selectByIndex(1);
Thread.sleep(3000);
drop3.selectByValue("3");


}
}
