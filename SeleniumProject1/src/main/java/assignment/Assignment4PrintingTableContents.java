package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4PrintingTableContents {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();	
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		
		List <WebElement> tableheaderElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));

		for(int i=0; i<tableheaderElements.size();i++)
		{
			System.out.print("|" +tableheaderElements.get(i).getText()+ "  |");
		}
		//to get the list of elements in the table
		for (int k=0; k<11; k++)
		{
		List<WebElement> firstRowDataElements = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[" + k + "]//td"));
		
		System.out.println("\n");

		for(int j=0; j<firstRowDataElements.size();j++)
		{
			System.out.print("|" +firstRowDataElements.get(j).getText() +" |");
		}
		}
		/*
		 * System.out.println("\n"); List<WebElement> secondRowDataElements =
		 * driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[2]//td"));
		 * 
		 * for(int j=0; j<secondRowDataElements.size();j++) { System.out.print("|"
		 * +secondRowDataElements.get(j).getText()+" |"); }
		 * 
		 * System.out.println("\n"); List<WebElement> thirdRowElements =
		 * driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[3]//td"));
		 * 
		 * for(int j=0; j<thirdRowElements.size();j++) { System.out.print("|"
		 * +thirdRowElements.get(j).getText()+" |"); } System.out.println("\n");
		 * List<WebElement> fourthRowDataElements = driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		 * 
		 * for(int j=0; j<fourthRowDataElements.size();j++) { System.out.print("|"
		 * +fourthRowDataElements.get(j).getText()+" |"); } System.out.println("\n");
		 * List<WebElement> fifthRowDataElements = driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[5]//td"));
		 * 
		 * for(int j=0; j<fifthRowDataElements.size();j++) { System.out.print("|"
		 * +fifthRowDataElements.get(j).getText()+" |"); } System.out.println("\n");
		 * List<WebElement> sixthRowDataElements = driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[6]//td"));
		 * 
		 * for(int j=0; j<sixthRowDataElements.size();j++) { System.out.print("|"
		 * +sixthRowDataElements.get(j).getText()+" |"); }
		 */
		
		
		driver.quit();
	}

}
