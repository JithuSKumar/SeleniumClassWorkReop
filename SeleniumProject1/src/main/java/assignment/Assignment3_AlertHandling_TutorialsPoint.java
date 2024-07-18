package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_AlertHandling_TutorialsPoint {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		
		WebElement inputAlertElement = driver.findElement(By.xpath("//div[@class='col-md-8 col-lg-8 col-xl-8']//div[4]//button[@class='btn btn-primary']"));
		inputAlertElement.click();
		driver.switchTo().alert().sendKeys("jithu");
		Thread.sleep(800);
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
