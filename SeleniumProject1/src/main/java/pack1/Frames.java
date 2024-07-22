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


		//1. Switch by name or id driver.switchTo().frame("frame1"); WebElement
		WebElement frameTextElement= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("First frame text: "+ frameTextElement.getText());

		//to switch back to parent frame driver.switchTo().parentFrame();


		//2. Switch By WebElement
		WebElement frameElement2= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameElement2);
		System.out.println("second text" + frameElement2.getText());

		//to return back to default page/parent frame from frame
		driver.switchTo().defaultContent();

		driver.quit();
	}

}
