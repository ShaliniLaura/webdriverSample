package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		// move to frame using index or id or name
		driver.switchTo().frame(0);
		
		WebElement inpbox=driver.findElement(By.xpath("//input[@type='text']"));
		inpbox.sendKeys("Hello Sharine");
		
		WebElement fra3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		// move to frame using webelement
		driver.switchTo().frame(fra3);
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		//To move to immediate parent frame
		driver.switchTo().parentFrame();
		inpbox.clear();
		inpbox.sendKeys("Hello Shalu");
		
		driver.switchTo().frame("frame3");
		
		//To move to Main Page
		driver.switchTo().defaultContent();
		
		System.out.println("Main Page Text:" + driver.findElement(By.xpath("//label//span")).getText());
		
	}
}
