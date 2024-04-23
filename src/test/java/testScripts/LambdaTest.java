package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog");
		
		//div.header__menu__items div[class*='rs-dropdown']
		//CSS Selector- Fetch element starts with
		driver.findElement(By.cssSelector("ul#menu-side-menu li[id^='menu-item-43']"));
		
		//CSS Selector- Fetch element ends with
		driver.findElement(By.cssSelector("ul#menu-side-menu li[id$='43']"));

		//CSS Selector- Fetch element - sub string matching
		driver.findElement(By.cssSelector("ul#menu-side-menu li[id*='43']"));

		
	   //getAttribute
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
	    String eleval=search.getAttribute("placeholder");
		System.out.println("Attribute Value:"+ eleval);
		
		//Submit method - Element should be inside Form element and with type='submit'
		search.sendKeys("Test");
		search.submit();
		
	
	}
}
