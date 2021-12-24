package hcll.testng;

import org.testng.annotations.Test;

public class annotations {
	 @Test
	  public void openbrowser() {
		  System.out.println("im test");
		  
		  
	  }
	  @Test(dependsOnMethods= {"login","openbrowser"})
	  public void logout() {
		  System.out.println("i test");
		  
		  
	  }

	  @Test
	  public void login() {
		  System.out.println(" test");

}
}
