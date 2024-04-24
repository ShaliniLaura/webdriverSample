package testScripts;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class DisplayMethodTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
//	//click on close icon when displayed on sending values to searchbox
//	  driver.findElement(By.cssSelector("#searchBar")).sendKeys("Test");
//	  WebElement closeicon= driver.findElement(By.cssSelector("a[title='Clear text']"));
//	  System.out.println(closeicon.isDisplayed());
//	  if(closeicon.isDisplayed())
//	  {
//		closeicon.click();  
//	  }
	  
//	  //Screenshot of entire page
//	  TakesScreenshot sc= (TakesScreenshot) driver;
//	  File src1=sc.getScreenshotAs(OutputType.FILE);
//	  String path1= System.getProperty("user.dir")+ "/screenshots/" + System.currentTimeMillis() +".png";
//	  FileUtils.copyFile(src1,new File(path1));
//	  
//	  //Screenshot of Particular element
//	  File src2=closeicon.getScreenshotAs(OutputType.FILE);
//	  String path2= System.getProperty("user.dir")+ "/partscreenshots/" + System.currentTimeMillis() +".png";
//	  FileUtils.copyFile(src2,new File(path2));
	  
	  
		
//	  Close Icon displayed on searching some text in search box
//	  Search is not done and close icon not visible
//	  o/p: False (Element present in DOM but not visible in UI so no error)
		
	  
//	  WebElement closeicon= driver.findElement(By.cssSelector("a[title='Clear text']"));
//	  System.out.println(closeicon.isDisplayed());
//	  if(closeicon.isDisplayed())
//	  {
//		closeicon.click();  
//	  }
	  
		
	//No such Element exception as Cleartext1 is given in cssselector instead of Cleartext	
	//Exception is because element is no available in DOM
//	  driver.findElement(By.cssSelector("#searchBar")).sendKeys("Test");
//	  WebElement closeicon= driver.findElement(By.cssSelector("a[title='Clear text1']"));
//	  System.out.println(closeicon.isDisplayed());
//	  if(closeicon.isDisplayed())
//	  {
//		closeicon.click();  
//	  }

      //Relative Locators
		String strid=driver.findElement(with(By.tagName("li"))
				.toLeftOf(By.id("pid6"))
				.below(By.id("pid1")))
				.getAttribute("id");
		System.out.println(strid);
		

		
		
	}

	
}
