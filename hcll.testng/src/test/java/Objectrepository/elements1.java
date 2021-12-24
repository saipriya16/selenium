package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class elements1 {
	
	
	public  WebElement signin_button(WebDriver d1) {
		return d1.findElement(By.id("nav-link-accountList-nav-line-1"));
		
	}
	
	
	public WebElement number(WebDriver d1) {
		return d1.findElement(By.id("ap_email"));
	}
	
	public WebElement continue_button(WebDriver d1) {
		return d1.findElement(By.id("continue"));
}
	
	
	public WebElement password(WebDriver d1) {
		return d1.findElement(By.id("ap_password"));
	}
	public WebElement sign(WebDriver d1) {
		return d1.findElement(By.id("signInSubmit"));
	}
	public WebElement searchbox(WebDriver d1) {
		return d1.findElement(By.id("twotabsearchtextbox"));
	}
		public WebElement searchele(WebDriver d1) {
			return d1.findElement(By.id("twotabsearchtextbox"));
		
}
		public WebElement searchbutton(WebDriver d1) {
			return d1.findElement(By.id("nav-search-submit-button"));
		
}
		public WebElement item1(WebDriver d1) {
			return d1.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"));
		
}
		public WebElement itemclick(WebDriver d1) {
			return d1.findElement(By.id("add-to-cart-button"));
		
}
		public WebElement cart(WebDriver d1) {
			return d1.findElement(By.xpath("//input[@type='submit']"));
			
		
}
		public WebElement cart1(WebDriver d1) {
			return d1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[5]/div[1]/span[2]"));
			
		
}
		
}