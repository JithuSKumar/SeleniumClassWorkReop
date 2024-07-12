package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement firstSelectElement = driver.findElement(By.id("single-input-field"));
		
		//created an object for inbuilt Select class using Index 
		Select dropdown1 = new Select(firstSelectElement);
		dropdown1.selectByIndex(1);
		
		//by value
		dropdown1.selectByValue("Green");
		
		//by visible text
		dropdown1.selectByVisibleText("Yellow");
		
		WebElement selectedElement = dropdown1.getFirstSelectedOption();
		String selectElemenetString = selectedElement.getText();
		System.out.println("Selected Element: " + selectElemenetString);
		
		
		// Multi dropdown selection
		
		WebElement secondSelectElement = driver.findElement(By.id("multi-select-field"));
		
		Select dropdown2 = new Select(secondSelectElement);

		for (int i =0; i<3; i++)
		{
			dropdown2.selectByIndex(i);
		}
		
		List <WebElement> multiValueElements =dropdown2.getAllSelectedOptions(); //creating list
		
		for(int j=0; j<multiValueElements.size(); j++)//get the size of list
		{
			System.out.println("List: "+ multiValueElements.get(j).getText());
		}
		
		
		
		
		driver.close();
		
	}

}
