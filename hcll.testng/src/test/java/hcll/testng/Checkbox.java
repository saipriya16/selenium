package hcll.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/checkbox.html");
	//WebDriverWait wait = new WebDriverWait(d1,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	d1.findElement(By.xpath("//input[@type='checkbox']")).click();
	if(((WebElement) d1).isSelected()) {
	System.out.println("checkbox is on");
	}
	else{
	System.out.println("checkbox is off");
	
	}
	((WebElement) d1).click();
	if(!((WebElement) d1).isSelected()) {
		System.out.println("checkbox is now off!!");
	}
}

}
