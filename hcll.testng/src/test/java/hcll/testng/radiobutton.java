package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class radiobutton {
	@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/radio.html");
	WebDriverWait wait = new WebDriverWait(d1,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yes")));
	d1.findElement(By.id("yes")).click();
	if(((WebElement) d1).isSelected()) {
	System.out.println("radiobutton is on");
	}
	else{
	System.out.println("radiobutton is off");
	
	}
	((WebElement) d1).click();
	if(!((WebElement) d1).isSelected()) {
		System.out.println("radiobutton is now off!!");
	}
}
}
