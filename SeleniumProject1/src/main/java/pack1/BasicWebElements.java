package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElements {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		System.out.println("Window launched with provided URL");


		//basic format for relative xpath //tagName[@attribute='attributeValue'] OR //tagName[text()='visibleText']

		WebElement usernamElement = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		usernamElement.sendKeys("jithu");
		System.out.println("User name provide");
		
		//WebElement passworElement = driver.findElement(By.xpath("//input[@id='loginform-password']"));
		WebElement passworElement = driver.findElement(By.id("loginform-password"));
		passworElement.sendKeys("abc");
		System.out.println("Password provide");
		
		//WebElement loginButtonElement = driver.findElement(By.xpath("//button[@name='login-button']"));
		WebElement loginButtonElement = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButtonElement.click();
		System.out.println("Login selected");
		
		driver.close();
	}

}
