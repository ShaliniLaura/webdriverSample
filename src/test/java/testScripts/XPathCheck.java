package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCheck {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/register");
		
		driver.findElement(By.xpath("//div[@class='w-full custom__border xls:mt-20 mt-10']")).click();
		//Thread.sleep(5000);
		String errmsg1=driver.findElement(By.xpath("(//div[@class='error__border w-full custom__border xls:mt-20 mt-10']//p[1]")).getText();
		System.out.println(errmsg1);
		
		//Contains
		
		
		//Text
		
		//starts-with
		
		
		
	}

}
