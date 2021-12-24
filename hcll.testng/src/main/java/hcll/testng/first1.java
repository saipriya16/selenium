package hcll.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first1 {
	  @Test(priority=2)
	  public void b() {
		  System.out.println("im test");
		  
		  
	  }
	  @Test(priority=-1,description="HI")
	  public void x() {
		  System.out.println("i test");
		  
		  
	  }

	  @Test(priority=0)
	  public void s() {
		  System.out.println(" test");
		  
		  
	  }

	  @Test(priority=-3)
	  public void f() {
		  System.out.println("F test");
		  
		  
	  }

	  
	  @AfterClass
	  public void afterClass() {
		  
		  System.out.println("AfterClass");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before test");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After test");

	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod");
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before class");
		  
	  }
	  
	  
	   
	}
