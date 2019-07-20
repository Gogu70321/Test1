package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTesting {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int numofcol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int numofrows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]")).size();
		System.out.println("No.of Rows" +numofrows);
		System.out.println("No.of Colum" +numofcol);
		
		
		for(int i = 2; i<=numofrows; i++) {
					
			for(int j=1; j<numofcol; j++) {
				
				
				
				
				
			}
		}
		
		
	}

}
