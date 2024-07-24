package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4PrintingTableContents {

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();	
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		List <WebElement> rowCountElement = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr"));
		int count = rowCountElement.size();

		//System.out.println(count);

		List <WebElement> tableheaderElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));

		for(int i=0; i<tableheaderElements.size();i++)
		{
			System.out.print("|" +tableheaderElements.get(i).getText()+ "  |");
		}
		//to get the list of elements in the table



		for (int k=1; k <count; k++) { List<WebElement> firstRowDataElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[" + k + "]//td"));

		System.out.println("\n");

		for(int j=0; j<firstRowDataElements.size();j++)
		{ 
			System.out.print("|" +firstRowDataElements.get(j).getText() +" |"); } }



		driver.quit();
	}

}
