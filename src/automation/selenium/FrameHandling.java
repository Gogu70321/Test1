package automation.selenium;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;
	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		//if frame name available
		driver.switchTo().frame("frame-middle");
		
		String data =  driver.findElement(By.id("content")).getText();
		System.out.println("Title: " +data);
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		
		driver.switchTo().frame("frame-right");
		
		
	}

}
