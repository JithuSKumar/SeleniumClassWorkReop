package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List <WebElement> rowCountElement = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		int count = rowCountElement.size();
		
		WebElement element;
		
		for (int i=1; i<=count;i++)
		{
			if(rowCountElement.get(i).getText().equals("Cedric Kelly"))
			{
				String locatorString = "//table[@id='dtBasicExample']//tbody//tr["+ i +"]//td[4]";
				element = driver.findElement(By.xpath(locatorString));
				System.out.println("Value: "+ element.getText());
				break;
			}
		}
		
		driver.quit();
	}

}
