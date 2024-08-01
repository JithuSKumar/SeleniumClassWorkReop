package basicTestNG;

import org.testng.annotations.Test;

public class PriorityTest {
	 @Test
	  public void testCase01()
	  {
		System.out.println("Test Case 01");  
	  }
	  @Test
	  public void testCase02()
	  {
		System.out.println("Test Case 02");  
	  }
	  @Test(priority = 1)//this will run first after all the methods without priority is executed, followed by the next priority
	  public void testCase03()
	  {
		System.out.println("Test Case 03");  
	  }
	  @Test(priority = -1)//if a negative value is set as priority, this will be executed before the methods without priority
	  public void testCase04()
	  {
		System.out.println("Test Case 04");  
	  }
	  @Test(priority = 2)
	  public void testCase05()
	  {
		System.out.println("Test Case 05");  
	  }
	  @Test(enabled = false)//this will not executed as it set as false, until its set as false
	  public void testCase06()
	  {
		System.out.println("Test Case 06");  
	  }
}
