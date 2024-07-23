package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSamples {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

		//ImplicitWait
		/*Usage: Implicit waits allow you to set a default waiting time for the WebDriver instance to wait for 
		elements to appear on the page before throwing a NoSuchElementException.
		This is useful when the elements on a page take varying amounts of time to load.*/
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		WebElement userNamElement = driver.findElement(By.id("loginform-username"));
		//FluentWait
		/*is a type of explicit wait that allows you to define the maximum amount of time to wait for a condition, 
		 * as well as the frequency with which to check the condition. 
		 * Additionally,ignore specific types of exceptions while waiting, such as NoSuchElementException.*/

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		

		fluentWait.until(ExpectedConditions.attributeToBe(userNamElement, "class", "form-control"));
		userNamElement.sendKeys("UserName");
		
		fluentWait.until(ExpectedConditions.alertIsPresent());//will wait till alert displays
		
		//ExplicitWait
		/*is used to wait for a certain condition to be met before proceeding with the test.
		 * It allows to specify the condition and the maximum time to wait for that condition to be true.
		 * This is more flexible and efficient compared to implicit waits.
		 */
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(userNamElement));

	}

}
