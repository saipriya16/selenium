package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.elements1;



public class signin {
@Test
    
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("https://www.amazon.in/");
	elements1 ele=new elements1();
	ele.signin_button(d1).click();
	ele.number(d1).sendKeys("8688276622");
	ele.continue_button(d1).click();
	ele.password(d1).sendKeys("tera1234");
	ele.sign(d1).click();
	ele.searchbox(d1).click();
	ele.searchele(d1).sendKeys("note 10 pro max");
	ele.searchbutton(d1).click();
	ele.item1(d1).click();
	Thread.sleep(3000);
	ele.itemclick(d1).click();
	ele.cart(d1).click();
	//ele.cart1(d1).click();

}
}
