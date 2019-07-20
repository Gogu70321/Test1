package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleAssaignment {

	static WebDriver driver;
	static String quantityEntered = "3";

	
	public static void main(String[] args) throws InterruptedException {
     
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		
		driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts' and @class='product-name']")).click();
		
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys(quantityEntered);
		
		Select size = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		size.selectByIndex(2);
		
		WebElement selectedsize  = size.getFirstSelectedOption();
		String sizeselected  = selectedsize.getAttribute("title");
		
		System.out.println("Selected Size: "+sizeselected);
		
		driver.findElement(By.cssSelector("#color_14")).click();
		
		String Expectedcolour= 	driver.findElement(By.cssSelector("#color_14")).getAttribute("title");
		System.out.println("Selected Colour: " +Expectedcolour);
		
		driver.findElement(By.id("add_to_cart")).click();
		
         Thread.sleep(5000);
		
		String coloursize = driver.findElement(By.xpath("//div[@class='layer_cart_product_info']/span[@id='layer_cart_product_attributes']")).getText();
		
		
		System.out.println("Colour and Size: " +coloursize);
		
		
		
		String [] coloursizE = coloursize.split(",");
		
	    String ActualColour = coloursizE[0];
	    String ActualSize =  coloursizE[1];
	    
	  String ActualQuantity=   driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']")).getText();
	
	  if(ActualColour.contains(Expectedcolour) && ActualSize.contains(sizeselected)  ) {
		  
		  System.out.println(" Size and Colour are matched");
	    
		}else {
			
			System.out.println("Size and Colour are not mached");
		}
   
	//  driver.findElement(By.xpath("//span[@class='cross']")).click();
	  
	  
	 // driver.findElement(By.id("quantity_wanted")).clear();
	  
	 //driver.findElement(By.id("quantity_wanted")).sendKeys("4");
}
}
