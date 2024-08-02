package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("\n" + s + "\n" +n +"\n");
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{2, "apple" }, {5, "ball"}, {7, "cat"}};
  }
  
  @Test(dataProvider = "data",dataProviderClass = AnnotationTest.class)
  public void test(int n, String s)
  {
	  System.out.println("\n"+n+"\n"+s+"\n");
  }
}


/* Akhil's code
@DataProvider (name = "data-provider")
public Object[][] dpMethod(){
return new Object[][] {{2, 3 }, {5, 7}};
}
*/