package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserInstantiation {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\Desktop\\EclipseWorkSpace\\Driver\\edgedriver\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.google.com/");

	}

}
