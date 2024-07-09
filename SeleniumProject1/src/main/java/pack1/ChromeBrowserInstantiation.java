package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInstantiation {

	public static void main(String[] args) {

		//to get the path, but its not mandatory after version selenium 4.5(current version : 4.22)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\EclipseWorkSpace\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// ChromeDriver = new ChromeDriver(); only launch chrome but webDriver is common for all browser
		
		//providing URL as input string
		//driver.get("https://www.google.com/");//wont keeps history//wait till page loads and provide the url(either 1 is enough)
		driver.navigate().to("https://www.google.com/");//keeps history// wont wait till page load time, instead directly provides the url once the browser is launched
		
		//for retrieving Title
		String titleString = driver.getTitle();
		System.out.println("Title: "+ titleString);
		
		//for retrieving URL
		String urlString = driver.getCurrentUrl();
		System.out.println("URL: " +urlString);
		
		//for maximizing window
		driver.manage().window().maximize();
		System.out.println("Maximise done");
		//for minimizing window
		driver.manage().window().minimize();
		System.out.println("Minimise done");
		
		//for printing source code
		String sourceCodeString = driver.getPageSource();
		//System.out.println("Source Code of page:/n" + sourceCodeString);
		
		//to go to previous page by selecting back button
		driver.navigate().back();
		System.out.println("Back Navigation done");
		
		//to go to next page
		driver.navigate().forward();
		System.out.println("Forward navigation done");
		
		//for page refresh
		driver.navigate().refresh();
		System.out.println("Page refresh done");
				
		//close current window
		//driver.close();
		
		//close all the browser window and end the WebDriver session.
		driver.quit();
		System.out.println("Session ended after closing the instance");
		


		
	}

}
