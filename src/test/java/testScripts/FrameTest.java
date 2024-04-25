package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//To move to frame 2
		driver.switchTo().frame("frame2");
		WebElement selele=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s= new Select(selele);
		s.selectByValue("big baby cat");
		
		Thread.sleep(2000);
		
		//To move to Main Page
		driver.switchTo().defaultContent();
				
		System.out.println("Main Page Text:" + driver.findElement(By.xpath("//label//span")).getText());
		
		
	}
}
