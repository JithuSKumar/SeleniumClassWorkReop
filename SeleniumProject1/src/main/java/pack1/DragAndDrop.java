package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();

		WebElement sourceElement1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));//source
		WebElement souElement2 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement souElement3 = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement souElement4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement targetElement = driver.findElement(By.id("mydropzone"));//target

		Actions actionObj = new Actions(driver);//object for Action class
		actionObj.dragAndDrop(sourceElement1, targetElement).perform();
		actionObj.dragAndDrop(souElement2, targetElement).perform();
		actionObj.dragAndDrop(souElement3, targetElement).perform();
		actionObj.dragAndDrop(souElement4, targetElement).perform();

		driver.quit();


	}

}
