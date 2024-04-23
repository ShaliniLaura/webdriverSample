package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelectTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		WebElement age=driver.findElement(By.id("isAgeSelected"));
		System.out.println(age.isSelected());
		if(!age.isSelected())
		{
			age.click();
		}
		
		//Checkbox
		driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
		
		//RadioButton
//		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
		
		
	}
	
}
