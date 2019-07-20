package automation.selenium;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(sc, new File("D:/SS/image1.png"));
	    
	    System.out.println("Captured ScreenShot Successfully");
		
	    
	    driver.close();
	}

}
