package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		
		String par=driver.getWindowHandle();
		System.out.println("Parent Id:"+ par);
				
		driver.findElement(By.xpath("//button[text()=' Click to open new Tab ']")).click();
		System.out.println("Page Title:"+ driver.getTitle());
		
		Set<String> all=driver.getWindowHandles();
		System.out.println("Windows Count:"+ all.size());
		for(String child: all)
		{
			if(!child.equalsIgnoreCase(par))
			{
				driver.switchTo().window(child);
				System.out.println("Child Id:"+ child);
				System.out.println("Child Page Title:"+ driver.getTitle());
			}
		}
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(par);
		driver.findElement(By.xpath("//button[text()=' Click to open new Window ']")).click();
		Set<String> all2=driver.getWindowHandles();
		System.out.println("ALL 2 Count:"+all2.size());
		for(String child2: all2)
		{
			if(!child2.equalsIgnoreCase(par))
			{
				driver.switchTo().window(child2);
				System.out.println("Child-2 Id:"+ child2);
				System.out.println("Child Page Title:"+ driver.getTitle());
			}
			
		}
		driver.close();// close child-2 window
		driver.switchTo().window(par);
		Thread.sleep(5000);
	//	driver.switchTo().newWindow(WindowType.WINDOW); // to open new url in new window
		driver.switchTo().newWindow(WindowType.TAB); // to open new url in new tab of same window
      //  driver.navigate().to("https://selenium.dev/");	
		driver.get("https://selenium.dev/");
        driver.quit();
	}
}
