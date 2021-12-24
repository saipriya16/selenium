package hcll.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserts {
	@Test
	public void testcase1() {
		int a = 1;
		int b = 3;
		int x = a+b;
		assertEquals (
				"assert if value: " + a + " is equal to " + b + " with a difference of positive x value:" + x, a,b,x):
			
	}

	
	@Test
	public void testcase2() {
		int a = 5;
		boolean flag;
		if (a < 2) {
			flag = true;
		} else {
			flag = false;
		}
		assertFalse(flag);
	}

	
	@Test (timeOut=20)
	public void testcase3() {
		String newStr = "newStr";
		assertNotNull("The object newStr is null", newStr);
	}
	@Test
	public void testCase4()
	{
		String obj = "java Junit";
		String x1 = obj;
		String otherObject = "selenium";

		
		Assert.assertNotSame(obj, otherObject);


		Assert.assertNotSame(obj, x1);

	
		Assert.assertSame(obj, x1);

		
		Assert.assertSame(obj, otherObject);
	}
	
	
 
}
