package pack1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		//to get single header
		WebElement singleElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[1]"));
		System.out.println("first header: "+ singleElement.getText());

		WebElement singleRoWebElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
		System.out.println("First row element: "+singleRoWebElement.getText());

		List<WebElement> firstColumnElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int k=0; k< firstColumnElements.size();k++)
		{
			System.out.println("Column " + k+ " :" + firstColumnElements.get(k).getText());
		}

		//to get the list of elements in the same html tag, here fetching the header of the table
		List <WebElement> tableheaderElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));

		for(int i=0; i<tableheaderElements.size();i++)
		{
			System.out.print("|" +tableheaderElements.get(i).getText()+ "        |");
		}
		System.out.println("\n");
		//to get the list of elements in the table
		List<WebElement> firstRowDataElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));

		for(int j=0; j<firstRowDataElements.size();j++)
		{
			System.out.print("|" +firstRowDataElements.get(j).getText()+ " |");
		}
		

		driver.quit();
	}

}
