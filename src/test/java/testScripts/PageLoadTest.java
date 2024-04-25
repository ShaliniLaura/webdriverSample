package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://uitestingplayground.com/");
		
		driver.manage().window().maximize();
		
		
		//To wait till entire page loads
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		System.out.println("Page Load Done");
		driver.findElement(By.xpath("//a[text()='Load Delay']")).click();
		
		driver.findElement(By.xpath("//button[text()='Button Appearing After Delay']")).click();
		
	}
}
