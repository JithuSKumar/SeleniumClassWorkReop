package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://demoqa.com/frames");
			driver.manage().window().maximize();
			
			//Switch by name or id
			driver.switchTo().frame("frame1");
			WebElement frameTextElement= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			
			System.out.println("First frame text: "+ frameTextElement.getText());
			driver.quit();
	}

}
