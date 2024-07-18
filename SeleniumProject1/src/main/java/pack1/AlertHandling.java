package pack1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickMeFirstElement = driver.findElement(By.xpath("//div[@class='card-body']//button[@class='btn btn-success']"));
		clickMeFirstElement.click();
		
		//for handling alert popup
		driver.switchTo().alert().accept();
		System.out.println("Handled first alert");
		
		//second
		clickMeFirstElement.click();
		Alert alertobj = driver.switchTo().alert();
		alertobj.getText();
		String alertText = alertobj.getText();
		System.out.println("Alert Text:" + alertText + "\nSecond alert handled");
		Thread.sleep(500);
		alertobj.accept();
		
		//for dismissing alert
		
		WebElement clickmeSecondElement = driver.findElement(By.xpath("//div[@class='card-body']//button[@class='btn btn-warning']"));
		clickmeSecondElement.click();
		driver.switchTo().alert().dismiss();
		System.out.println("First Alert dismiss");
		
		//second
		clickmeSecondElement.click();
		System.out.println("Cancel Alert text: "+ alertobj.getText());
		alertobj.dismiss();
		
		//Providing inputs in alert box
		WebElement thirdElement = driver.findElement(By.xpath("//div[@class='card-body']//button[@class='btn btn-danger']"));
		thirdElement.click();
		driver.switchTo().alert().sendKeys("Alert Text");
		driver.switchTo().alert().accept();
		
		//second
		thirdElement.click();
		System.out.println("Prompt alert text: "+ alertobj.getText());
		alertobj.sendKeys("second text");
		alertobj.accept();
		
		
		driver.quit();
	}

}
