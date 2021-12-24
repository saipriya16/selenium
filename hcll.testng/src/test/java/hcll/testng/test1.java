package hcll.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
@Test
      
	public  void method() {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/");
	d1.findElement(By.className("wp-categories-title")).click();
	d1.findElement(By.id("email")).sendKeys("abc@gmail");
	//d1.findElements(By.xpath("input[@value='Append']")).sendKeys("hiiiii");
	d1.findElement(By.name("username")).sendKeys("ggggggg");
	d1.findElement(By.name("username")).sendKeys("hhhh");
	
	

	}

}
