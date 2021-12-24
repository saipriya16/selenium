package hcll.testng;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unoderedlist {
	@Test


public  void method1() throws InterruptedException, AWTException, IOException   {
System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver d1;
d1=new ChromeDriver();
d1.get("http://demo.automationtesting.in/AutoComplete.html");
d1.findElement(By.id("searchbox")).sendKeys("c");
Thread.sleep(2000);
List<WebElement>ele1= (List<WebElement>) d1.findElement(By.xpath("//ul[@id='ui-id-1']/li"));
for(WebElement list:ele1) {
	if(list.getText().equalsIgnoreCase("canada")) {
		list.click();
		break;
	}

}
Robot robot1=new Robot();
Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rect=new Rectangle(sc_size);
BufferedImage Source=robot1.createScreenCapture(rect);
File destination=new File("C:\\\\Users\\\\riyan\\\\Documents\\\\saipriya\\\\screenshort2");
ImageIO.write(Source, "png", destination);


}
}
