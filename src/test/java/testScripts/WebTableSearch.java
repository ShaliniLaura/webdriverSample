package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
				
		//To find salary of wagner
		String wagnersalary= driver.findElement(By.xpath("//td[text()='B. Wagner']//following-sibling::td[5]")).getText();
		System.out.println("Wagner Salary"+ wagnersalary);
		
		//To find all details of Wagner
		List<WebElement> items =driver.findElements(By.xpath("//td[text()='B. Wagner']//following-sibling::td"));
		System.out.println("Number of Items:"+ items.size());
		for(WebElement details: items)
		{
			System.out.println(details.getText());
		}
		
		//List of employees working in San Francisco
		List<WebElement> sanfra_emp =driver.findElements(By.xpath("//td[text()='San Francisco']//preceding-sibling::td[2]"));
		System.out.println("Number of San Francisco Employees:"+ sanfra_emp.size());
		for(WebElement emp: sanfra_emp)
		{
			System.out.println(emp.getText());
		}
		
		//ancestor
		//descendant
		
		
	}

}
