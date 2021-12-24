package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script1 {
	@Given ("^ Open chrome browser and the url $")
	public  void open_amazon_website() {
		System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/");
	}
	@And ("^click on signin button $")
	public  void signin_button(WebDriver d1) {
		d1.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
	
	}
	 @When  ("^enter mailid & click continue button $")
	 public void number(WebDriver d1) {
		 d1.findElement(By.id("ap_email")).sendKeys("8688276622");
		 d1.findElement(By.id("continue")).click();
	}
	 @And ("^enter password $")
	 public void password(WebDriver d1) {
			d1.findElement(By.id("ap_password")).sendKeys("tera1234");
		}
	
	 @Then   ("^click on signin  button $")
	 public void sign(WebDriver d1) {
			 d1.findElement(By.id("signInSubmit")).click();
		}
	 
	 
	 //product add to cart
	 @Given ("^Open chrome browser and the url $")
	 public  void open_homepage() {
			System.setProperty("webdriver.chrome.driver","C:\\saipriya.chrome\\saipriya.chrome\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			d1.manage().window().maximize();
			d1.get("https://www.amazon.in/");
		}
	 @And  ("^enter the product in search bar $")
	 public void searchbox(WebDriver d1) {
			d1.findElement(By.id("twotabsearchtextbox")).click();
		d1.findElement(By.id("twotabsearchtextbox")).sendKeys("note 10 pro max");
			
	}
	 @When ("^click  on search button $")
	 public void searchbutton(WebDriver d1) {
			d1.findElement(By.id("nav-search-submit-button")).click();
	 }
	 @And ("^click on product $")
	 public void item1(WebDriver d1) {
			d1.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
			
		
}
	 @Then ("^click on add to cart button $")
	 public void itemclick(WebDriver d1) {
			 d1.findElement(By.id("add-to-cart-button")).click();
		
}
		
	
	
	
	
	
	
}	