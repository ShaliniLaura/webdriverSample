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
	//	driver.findElement(By.xpath("//input[@name='username' or @type='text']")).sendKeys("tomsmith");
	//	driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("SuperSecretPassword!");
		
		//Locate using Xpath
		 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		
		//CSS Selector
		//CSS Selector - ID
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		//CSS Selector - Name
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
		//CSS Selector - Tag and Class
		//	driver.findElement(By.cssSelector("button.radius")).click();
		//CSS Selector - Compound class
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		//CSS Selector - Tag and Compound Class Name
	   //	driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
		
		
		//driver.findElement(By.className("radius")).click();
		
		
		 
		//Locate  WebElement using ClassName locator with compound class Names gives below errors
		//org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
		 //driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
		 
		// Locate using Link Text
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		// Locate using Partial Link Text
		driver.findElement(By.partialLinkText("Elemental")).click();
		
		
		

	}

}
