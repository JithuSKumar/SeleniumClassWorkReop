package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1BasicElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		//Single Input Field
		
		WebElement formDemoElement = driver.findElement(By.linkText("Simple Form Demo"));
		formDemoElement.click();
		System.out.println("Simple Form Demo: selected");
		
		WebElement firstInputMessagElement = driver.findElement(By.id("single-input-field"));
		firstInputMessagElement.sendKeys("First Message in Simple Form Demo page");
		
		WebElement firstButtonElement = driver.findElement(By.id("button-one"));
		firstButtonElement.click();
		System.out.println("Show message: selected");
		
		WebElement firstMessageContent = driver.findElement(By.id("message-one"));
		
		String firstMessageDisplay = firstMessageContent.getText();
		System.out.println("Message displayed: " + firstMessageDisplay);
		
		//Two Input Fields
		
		System.out.println("\n");
		
		WebElement secondDemofieldAElement = driver.findElement(By.id("value-a"));
		secondDemofieldAElement.sendKeys("3");
		
		WebElement secondDemofieldBElement = driver.findElement(By.id("value-b"));
		secondDemofieldBElement.sendKeys("5");
		
		WebElement secondButtonElement = driver.findElement(By.id("button-two"));
		secondButtonElement.click();
		System.out.println("Get Total: selected");
		
		WebElement secondElementValuElement = driver.findElement(By.id("message-two"));
		
	
		String secondMessageDisplayString = secondElementValuElement.getText();
		System.out.println("Sum value: "+ secondMessageDisplayString);
		
				
		driver.quit();
		
	}

}
