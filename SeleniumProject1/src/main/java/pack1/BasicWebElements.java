package pack1;

import java.util.jar.Attributes.Name;

import javax.swing.text.html.parser.TagElement;

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
		System.out.println("User name provided");

		//WebElement passworElement = driver.findElement(By.xpath("//input[@id='loginform-password']"));
		WebElement passworElement = driver.findElement(By.id("loginform-password"));
		passworElement.sendKeys("abc");
		System.out.println("Password provided");
		passworElement.clear();
		System.out.println("password field cleared");
		passworElement.sendKeys("pwd");

		WebElement checkBoxElement = driver.findElement(By.id("loginform-rememberme"));
		checkBoxElement.click();

		//WebElement loginButtonElement = driver.findElement(By.xpath("//button[@name='login-button']"));
		WebElement loginButtonElement = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButtonElement.click();
		System.out.println("Login selected");


		//to get font size of any element
		String fontsizeString = loginButtonElement.getCssValue("font-size");
		System.out.println("Font size: "+ fontsizeString);

		//to get font weight of element
		String fontWeigString = loginButtonElement.getCssValue("font-weight");
		System.out.println("Font weight value: "+fontWeigString);

		//to get color of any element
		String elementColourString = loginButtonElement.getCssValue("color");
		System.out.println("Colour code: "+elementColourString);

		//to get attribute value of any element
		String attributeTypeString = loginButtonElement.getAttribute("class");
		System.out.println("Attribute value: "+attributeTypeString);

		//fetching attribute of username field
		String usernameAttributeString = usernamElement.getAttribute("name");
		System.out.println("User Name Attribute: "+ usernameAttributeString);
		String usernamePlaceHolderAttributeString = usernamElement.getAttribute("placeholder");
		System.out.println("Placeholder attribute value:"+usernamePlaceHolderAttributeString);
		String usernameTypeString = usernamElement.getAttribute("type");
		System.out.println("Type value: " + usernameTypeString);
		String usenameClassAttributeString = usernamElement.getAttribute("class");
		System.out.println("Class attribute Value: "+ usenameClassAttributeString);

		//to get Tag name of any element
		String loginTagNameString = loginButtonElement.getTagName();
		System.out.println("Tage name of Login Button: "+loginTagNameString);
		String usernameTagnamString =usernamElement.getTagName();
		System.out.println("Tag name of user name: "+usernameTagnamString);

		//to get Text of any element
		String loginButtonTextString = loginButtonElement.getText();
		System.out.println("Text displayed in Login button: "+loginButtonTextString);

		driver.close();
	}

}
