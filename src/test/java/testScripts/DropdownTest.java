package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		s.selectByValue("Monday");
		
       // Multi Value DropDown
		Select mulsel= new Select(driver.findElement(By.xpath("//select[@name='States']")));
		if(mulsel.isMultiple())
		{
			mulsel.selectByIndex(0);
			mulsel.selectByVisibleText("Texas");
			mulsel.selectByValue("Florida");
		}
	
		List<WebElement> selectedopt= mulsel.getAllSelectedOptions();
		System.out.println("Selected Option Count:"+ selectedopt.size());
		
		mulsel.deselectByVisibleText("Texas");
		mulsel.deselectAll();
		//getOptions
		//others
		
		
	}
}
