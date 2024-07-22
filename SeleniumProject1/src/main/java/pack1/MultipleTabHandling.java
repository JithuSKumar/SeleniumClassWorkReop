package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		//to get the unique name of Parent Window
		String parentWindowString = driver.getWindowHandle();//to get single window
		System.out.println("Parent window: "+ parentWindowString);

		WebElement newTabButton = driver.findElement(By.id("tabButton"));
		newTabButton.click();
		Set<String> setNameAllWindows = driver.getWindowHandles();//to get all the windows n current session

		for(String childWindow:setNameAllWindows)
		{
			if(!parentWindowString.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Child Window: "+ childWindow);
				
				WebElement newTabPageTextElement = driver.findElement(By.id("sampleHeading"));
				System.out.println("Text in new page: " +newTabPageTextElement.getText());
			}
		}
		
		driver.switchTo().window(parentWindowString);//return to Parent window

		driver.quit();
	}

}
