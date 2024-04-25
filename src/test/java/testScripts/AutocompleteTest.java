package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutocompleteTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		
		String expval="BASIC";
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		
		
		WebElement src=driver.findElement(By.cssSelector("#tags"));
		
		//To pass values to the search box
		src.sendKeys("as");
		Thread.sleep(2000);
		List<WebElement> lst= driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
		System.out.println("List Size: "+ lst.size());
		for(WebElement all : lst)
		{
			System.out.println(all.getText());
			if(all.getText().equalsIgnoreCase(expval))
			{
				all.click();
				break;
			}
		
		}
		
	}
}
