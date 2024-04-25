package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions act= new Actions(driver);
		driver.findElement(By.cssSelector("#age")).sendKeys(Keys.ARROW_DOWN);
		act.moveToElement(driver.findElement(By.cssSelector("#age"))).perform();
         
		String tooltiptext=driver.findElement(By.xpath("//div[@role='log']")).getText();
	    System.out.println("Tool Tip Text: "+ tooltiptext);
	    
	    driver.findElement(By.cssSelector("#age")).sendKeys("20");
	}
}
