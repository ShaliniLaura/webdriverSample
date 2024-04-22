package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Manager
		//ChromeOptions options= new ChromeOptions();
		//options.setBrowserVersion("115");
		//WebDriver driver=new ChromeDriver(options);
		
		//Headless Mode
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		 WebDriver driver=new ChromeDriver(options);
		
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	//	driver.navigate().to("https://www.google.com/");
		System.out.println("Page Title: "+ driver.getTitle());
		WebElement srcBox=driver.findElement(By.id("APjFqb"));
	//	Locating using Name Attribute
	//	WebElement srcBox= driver.findElement(By.name("q"));
    //	Locating using Name Attribute
	//	WebElement srcBox= driver.findElement(By.className("gLFyf"));
    //	Locating using Name Attribute
	//	WebElement srcBox= driver.findElement(By.tagName("textarea"));
		
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title: "+ driver.getTitle());
		System.out.println("Page Url: "+ driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Page Back Title: "+ driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Page Forward Title: "+ driver.getTitle());
		

	}

}
