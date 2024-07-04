package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumClass {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\EclipseWorkSpace\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// ChromeDriver = new ChromeDriver(); only launch chrome but webDriver is common for all browser
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		

		/*
		 System.setProperty("webdriver.edge.driver","path\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
		 */
	}

}
