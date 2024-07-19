package pack1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();

		WebElement dynamicClikElement = driver.findElement(By.xpath("//button[text()='Click Me']"));
		dynamicClikElement.click();

		//Creating object for Action Class
		Actions actionObj = new Actions(driver);

		//RightClick
		WebElement rightClickElement = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		actionObj.contextClick(rightClickElement).perform();

		//doubleClick
		WebElement doubleClickElement = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		actionObj.doubleClick(doubleClickElement).build().perform();


		//MouseHovering
		actionObj.moveToElement(doubleClickElement).build().perform();
		Thread.sleep(1000);
		actionObj.moveToElement(dynamicClikElement).perform();
		Thread.sleep(1000);

		//Keyboard Events

		actionObj.sendKeys(Keys.ARROW_RIGHT).perform();
		actionObj.sendKeys(Keys.ARROW_LEFT).perform();

		driver.quit();
	}

}
