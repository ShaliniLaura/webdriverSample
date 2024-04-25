package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://uitestingplayground.com/ajax");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[id='ajaxButton']")).click();
		 
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='content']//p"),"Data loaded with AJAX get request."));
		System.out.println("Text:"+ driver.findElement(By.xpath("//div[@id='content']//p")).getText());
		
	}
}
