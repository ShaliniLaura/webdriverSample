package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		
		//Accessing Shadow DOM Elements
		//Fetching Shadow Host which has poroperty as 
		WebElement shadowhost= driver.findElement(By.xpath("(//my-paragraph)[1]"));
		SearchContext context= shadowhost.getShadowRoot();
		WebElement ele=context.findElement(By.cssSelector("slot[name='my-text']"));
		System.out.println(ele.getText());
		
		WebElement outofshadow=driver.findElement(By.xpath("//span[contains(text(),'some')]"));
		System.out.println(outofshadow.getText());
		
		
	}
}
