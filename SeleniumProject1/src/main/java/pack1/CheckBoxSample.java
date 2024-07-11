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
		System.out.println("repeated check after deselction: "+ checkBoxElement.isSelected());
		
		System.out.println("\n");
		
		WebElement buttonSelectAllElement = driver.findElement(By.id("button-two"));
		buttonSelectAllElement.click();
		
		boolean checkSelection1 = buttonSelectAllElement.isDisplayed();
		System.out.println("Status of selection: "+ checkSelection1);
		
		boolean checkSelectionEnabled = buttonSelectAllElement.isEnabled();
		System.out.println("Enable selection status: " + checkSelectionEnabled);
		
		buttonSelectAllElement.click();
		System.out.println("deselection check: "+ buttonSelectAllElement.isSelected());
		
		driver.close();
		
	}

}
