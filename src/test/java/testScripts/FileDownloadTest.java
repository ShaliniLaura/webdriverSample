package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadTest {
 
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt= new ChromeOptions();
		// To download file in default Downloads folder- false set for download.prompt_for_download
		//To download file to specific folder- true set for download.prompt_for_download
		//Some Browser has restrictions to download so below is used
		Map<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", true);
		opt.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		Thread.sleep(2000);
		
	}
	
}
