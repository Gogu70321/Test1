package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Practice {
	
	static WebDriver driver;

  @Test(groups = {"Sanity", "regression"} ,priority=1)
  public void TitleVerification() {
	  
		
		driver.get("https://demo.opencart.com");
		String sTitle = driver.getTitle();
		System.out.println("Title is "+sTitle);
		
      Assert.assertEquals(sTitle, "Your Store");
      
      String searchword = "iphone";
		String qty = "3";
		driver.findElement(By.name("search")).sendKeys(searchword);
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByIndex(3);
		driver.findElement(By.name("sub_category"));
			  
  }
  
  @Test(groups = {"Sanity"},priority=2)
  public void CartVerification() throws InterruptedException {
	   
	  String  searchword="iPhone";
	  String quntity = "3";
	  driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("3");
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cart")).click();
		Thread.sleep(3000);
		
		String addedProduct = driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]/table//tr/td[2]")).getText();
		String addedqty = driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]/table//tr/td[3]")).getText();
		System.out.println(addedProduct);
		Assert.assertEquals(addedProduct, searchword);
		Assert.assertEquals(addedqty, quntity);
		
  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("BeforeMethod");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethpod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After TEst ");
  }

  @BeforeSuite(groups={"init"})
  @Parameters({"Browser"})
  public void beforeSuite(String sBrowser) {
	  
	  if(sBrowser.equalsIgnoreCase("chrome")) {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
  }else if(sBrowser.equalsIgnoreCase("firefox")) {
	  

	  System.setProperty("webdriver.gecko.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
  }else if(sBrowser.equalsIgnoreCase("IE")) {
	  
	  System.setProperty("webdriver.ie.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new InternetExplorerDriver();
  }else {
	  
	  System.out.println("Not a valid browser" +sBrowser);
  }
  }

  @AfterSuite
  public void afterSuite() {
	  
	 driver.close();
  }

}
