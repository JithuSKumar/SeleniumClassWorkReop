package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void scrollTestCase() {
		// JS Executor for scrolling down to the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)");

		// JS Executor for locating & selecting an element
		WebElement element = driver.findElement(By.xpath("//a[@class='sign-in-tooltip-link']"));
		js.executeScript("arguments[0].click()", element);
	}
	//used if any element is in blurred state, not used in current script
	public void sendValueUsingJavaScriptAndBlur(WebDriver driver, WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + value + "'");
		js.executeScript("arguments[0].blur()", element);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

