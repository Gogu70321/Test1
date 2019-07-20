package automation.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("D:\\Automation\\sample.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("button1")).click();	
		driver.switchTo().alert().accept();
		
		String currentBrowser = driver.getWindowHandle();
		String NewBrowser = " ";
		driver.findElement(By.linkText("Yahoo")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		
		
		for(String s : allwindows) {
			
			if(!s.equals(currentBrowser)){
				NewBrowser= s;
				break;
			}
		}
	    driver.switchTo().window(NewBrowser);
	    
	    System.out.println("New Window Title: " +driver.getTitle());
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("uh-search-box")).sendKeys("Yes");
	    
        driver.switchTo().window(currentBrowser);
        
        
   
	}

}
