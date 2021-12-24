package hcll.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadfile {
@Test
    
	public  void method() throws InterruptedException, AWTException  {
	System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("https://www.ilovepdf.com/pdf_to_word");
	d1.findElement(By.id("pickfiles")).click();
	String file="C:\\Users\\riyan\\Downloads\\priyanka project\\testleaf (1).pdf";
	StringSelection s1=new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	//r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	//r.keyRelease(KeyEvent.VK_CONTROL);
	//r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);	
	
	
	

}
}