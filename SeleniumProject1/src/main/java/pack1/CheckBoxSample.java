package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkBoxElement= driver.findElement(By.id("gridCheck"));
		checkBoxElement.click();
		
		boolean checkBoxVisibility = checkBoxElement.isSelected();
		System.out.println("Element visibility: " + checkBoxVisibility);
		
		checkBoxElement.click();
		System.out.println("repeated check: "+ checkBoxElement.isSelected());
		
		driver.close();
		
	}

}
