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
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page Title: "+ driver.getTitle());
		WebElement srcBox=driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title: "+ driver.getTitle());

	}

}
