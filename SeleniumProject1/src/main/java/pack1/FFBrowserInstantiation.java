package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFBrowserInstantiation {

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver", "C:\\Users\\USER\\Desktop\\EclipseWorkSpace\\Driver\\firefoxgeckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
	}

}
