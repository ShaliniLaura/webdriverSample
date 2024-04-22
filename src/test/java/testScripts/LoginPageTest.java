package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		//xpath using logical operators
		driver.findElement(By.xpath("//input[@name='username' or @type='text']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("SuperSecretPassword!");
		
		//driver.findElement(By.className("radius")).click();
		
		//Locate using Xpath
		 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		 
		//Locate  WebElement using ClassName locator with compound class Names gives below errors
		//org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
		 //driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
		 
		// Locate using Link Text
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		// Locate using Partial Link Text
		driver.findElement(By.partialLinkText("Elemental")).click();
		
		
		

	}

}
