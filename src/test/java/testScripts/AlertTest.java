package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https:/demo.seleniumeasy.com/javascript-alert-box-demo.html");
		//To accept Alert
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		Alert alt= driver.switchTo().alert();
		System.out.println("Alert Msg:" + alt.getText());
		alt.accept();
		
//		//Confirmation Alert
//		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
//		Alert alt1= driver.switchTo().alert();
//		System.out.println("Alert Msg:" + alt1.getText());
//		alt1.dismiss();
//		
//		//Prompt Alert
//		//
//		driver.findElement(By.xpath("button[text()='Click for Prompt Box']")).click();
//		Alert alt2= driver.switchTo().alert();
//		alt2.sendKeys("Hello World");
//		System.out.println("Alert Msg:" + alt2.getText());
//		alt2.accept();
		
		
		
		
		
	}
}
