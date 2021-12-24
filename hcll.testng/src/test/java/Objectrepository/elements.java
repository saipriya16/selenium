package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements {
	public  WebElement signin_button(WebDriver d1) {
		return d1.findElement(By.id("nav-link-accountList-nav-line-1"));
	}
	public WebElement createacc(WebDriver d1) {
		return d1.findElement(By.id("createAccountSubmit")); 

}
	public WebElement name(WebDriver d1) {
		return d1.findElement(By.id("ap_customer_name"));
	}
	public WebElement number(WebDriver d1) {
		return d1.findElement(By.id("ap_email"));
	}
	public WebElement password(WebDriver d1) {
		return d1.findElement(By.id("ap_password"));
	}
	public WebElement confrimpassword(WebDriver d1) {
		return d1.findElement(By.id("ap_password_check"));
	}
	public WebElement continue_button(WebDriver d1) {
		return d1.findElement(By.id("continue"));
	
	
	
	}
}