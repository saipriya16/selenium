package hcll.testng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookies {
	@Test
	public void method1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
	    d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		Thread.sleep(4000);
	    d1.get("https://www.amazon.in/");
	   
	    Set<Cookie> ck=d1.manage().getCookies();
	    List<Cookie> li=new ArrayList<Cookie>(ck);
	    System.out.println("list of cookies is"+li.size());
	    for(Cookie a:li)
	    {
	    	System.out.println(a +" "+" "+a.getName()+" "+a.getDomain()+" "+a.getExpiry());
	    }
	    Cookie cookie_name=new Cookie("amazonTest","1234");
	    d1.manage().addCookie(cookie_name);
	    d1.manage().getCookieNamed("amaxonTest");
	    d1.manage().deleteCookieNamed("amazonTest");
	     d1.close();
		

		
	}


	

}
 
