package hcll.testng;

import org.testng.annotations.Test;

public class dependsongroup {
	@Test(dependsOnGroups={"view"})
	public void view()
	{
		System.out.println("view dashboard");
	}
	@Test(groups= {"open browser"})
	public void openbrowser()
	{
		System.out.println("open browser");
	}
	@Test(groups={"login"})
	public void login()
	{
		System.out.println("homepage");
	}

}
