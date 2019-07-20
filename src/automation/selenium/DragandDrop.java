package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
  
	   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		//MouseHover
		WebElement mousehover = driver.findElement(By.linkText("Resizable"));
		action.moveToElement(mousehover).build().perform();
		
		action.contextClick(mousehover).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		//Drag and Drop
		/*driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		
		action.dragAndDrop(drag, drop).build().perform();*/
		
	}

}
