package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");//direct page URL
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.xpath("//div[1]//div[2]//div[1]//div[1]//div[@class='card-header']")).getText());//first box header

		WebElement firstGenderSelectionElement = driver.findElement(By.id("inlineRadio2"));
		System.out.println("\nBefore Element Selection");
		System.out.println("Element Visibility: "+ firstGenderSelectionElement.isDisplayed());;
		System.out.println("Element is enabled: "+ firstGenderSelectionElement.isEnabled());
		System.out.println("Element selection: "+ firstGenderSelectionElement.isSelected());

		WebElement firstSelectionDisplayElement = driver.findElement(By.id("button-one"));
		firstSelectionDisplayElement.click();

		WebElement firstDisplayMessagElement = driver.findElement(By.id("message-one"));
		System.out.println("First Message: "+ firstDisplayMessagElement.getText());

		System.out.println("\nAfter Selection");
		firstGenderSelectionElement.click();

		System.out.println("Element visibility: "+firstGenderSelectionElement.isDisplayed());
		System.out.println("Element Enable: "+ firstGenderSelectionElement.isEnabled());
		System.out.println("Element selection: "+ firstGenderSelectionElement.isSelected());

		firstSelectionDisplayElement.click();
		System.out.println("First Message: "+ firstDisplayMessagElement.getText()+ "\n");

		System.out.println(driver.findElement(By.xpath("//div[1]//div[2]//div[2]//div[@class='card-header']")).getText()+"\n");//second box header

		WebElement secondGenderSelection = driver.findElement(By.id("inlineRadio11"));
		System.out.println("\nBefore Selection");
		System.out.println("Visibility: "+ secondGenderSelection.isDisplayed());
		System.out.println("Enabled: "+ secondGenderSelection.isEnabled());
		System.out.println("Selection: "+ secondGenderSelection.isSelected());

		WebElement secondDisplayElement = driver.findElement(By.id("button-two"));
		secondDisplayElement.click();
		System.out.println("\n"+driver.findElement(By.id("message-two")).getText());

		System.out.println("\nAfter Selection\n");
		System.out.println(driver.findElement(By.xpath("//form[@method='POST']//h4")).getText());//sub header 1
		secondGenderSelection.click();
		System.out.println("Visibility: "+ secondGenderSelection.isDisplayed());
		System.out.println("Enabled: "+ secondGenderSelection.isEnabled());
		System.out.println("Selection: "+ secondGenderSelection.isSelected());

		System.out.println("\n"+driver.findElement(By.xpath("//form[@method='POST']//h4[2]")).getText());//sub header 2
		
		WebElement secondAgeGroupElement = driver.findElement(By.id("inlineRadio23"));
		secondAgeGroupElement.click();
		System.out.println("Visibility: "+ secondAgeGroupElement.isDisplayed());
		System.out.println("Enabled: "+ secondAgeGroupElement.isEnabled());
		System.out.println("Selection: "+ secondAgeGroupElement.isSelected());

		secondDisplayElement.click();
		System.out.println("\n"+driver.findElement(By.id("message-two")).getText());

		driver.quit();
	}

}
