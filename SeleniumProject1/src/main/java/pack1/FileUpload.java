package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException 
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();

		WebElement uploadButtonElement = driver.findElement(By.id("uploadfile_0"));
		//uploadButtonElement.click();

		//Selection using ActionClass

		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(uploadButtonElement).click().perform();
		
		  StringSelection ss = new StringSelection("‪C:\\Users\\USER\\Desktop\\Obsqura\\ExcelFiles\\ExcelRead.xlsx");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  
		  Robot robot = new Robot(); 
		  robot.delay(250);
		  robot.keyPress(KeyEvent.VK_CONTROL); 
		  robot.keyPress(KeyEvent.VK_V);
		  robot.delay(1000); 
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V); 
		  robot.delay(1000);
		  robot.keyPress(KeyEvent.VK_ENTER); 
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 
		WebElement termsCondtionsElement = driver.findElement(By.id("terms"));
		//termsCondtionsElement.click();
		
		WebElement submitButtElement = driver.findElement(By.id("submitbutton"));
		//submitButtElement.click();
		
		
		// type 2
		
		//actionObj.moveToElement(uploadButtonElement).click().perform();
		
		//uploadButtonElement.sendKeys("C:\\Users\\USER\\Desktop\\Obsqura\\ExcelFiles\\ExcelRead.xlsx");
		//termsCondtionsElement.click();
		
		//submitButtElement.click();
		
		//driver.quit();

	}

}
