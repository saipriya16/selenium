package Functionality;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.elements;

public class login {
@Test
    
	public  void method()  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("https://www.amazon.in/");
	elements ele=new elements();
	ele.signin_button(d1).click();
	ele.createacc(d1).click();
	ele.name(d1).sendKeys("saipriya");
	ele.number(d1).sendKeys("8688276622");
	ele.password(d1).sendKeys("tera1234");
	ele.confrimpassword(d1).sendKeys("tera1234");
	ele.continue_button(d1).click();
	

}
}
