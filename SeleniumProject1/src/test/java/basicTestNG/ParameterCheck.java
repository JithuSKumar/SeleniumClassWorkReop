package basicTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterCheck {
  @Test
  @Parameters({"p1","p2"})
  public void testcase01(int a, String s) 
  {
	  System.err.println("Value from p1 "+a);
	  System.err.println("Value from p2 " +s);
  }
}
