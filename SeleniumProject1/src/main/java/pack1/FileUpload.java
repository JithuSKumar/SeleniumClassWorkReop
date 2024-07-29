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

		StringSelection ss = new StringSelection("C:\\Users\\USER\\Desktop\\Topics.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot(); 
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V); 
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);


		WebElement termsCondtionsElement = driver.findElement(By.id("terms"));
		termsCondtionsElement.click();

		WebElement submitButtElement = driver.findElement(By.id("submitbutton"));
		submitButtElement.click();


		// type 2
		uploadButtonElement.sendKeys("C:\\Users\\USER\\Desktop\\Obsqura\\ExcelFiles\\ExcelRead.xlsx");
		termsCondtionsElement.click();

		submitButtElement.click();

		driver.quit();

	}

}
