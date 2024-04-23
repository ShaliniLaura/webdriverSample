
package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt= new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("--blink-settings=imagesEnabled=false"); // Not to load images in page
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
	
//		// Mouse Actions
		driver.get("https://demo.opencart.com");
		
		WebElement search= driver.findElement(By.xpath("//input[@name='search']"));
		
		Actions act= new Actions(driver);
		
//		//Right Click Action
//		act.contextClick(search).perform();
		
		//Mouse Hover
		WebElement compo= driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3) > a"));
		//act.moveToElement(compo).perform();
		
		//Mouse Click after Hover
		WebElement mon= driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3) > div li:nth-child(2)"));
		//act.click(mon).perform();
		
		//Combination of above both actions- Hover and click
		act.moveToElement(compo).click(mon).build().perform();
		
		

//		//Mouse Actions- Double Click, Multiple Double Clicks
//		driver.get("https:www.stqatools.com/demo/DoubleClick.php");
//		WebElement btn= driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
//		Actions a= new Actions(driver);
//		
//		Thread.sleep(5000);
//		//Double Click
//		a.doubleClick(btn).perform();
//		Thread.sleep(1000);
//		//Multiple Clicks
//		a.doubleClick(btn).doubleClick(btn).build().perform();
		
		
		
		
	}
}
