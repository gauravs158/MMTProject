package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import homePage.HomePageInit;

public class BrowserInitiate{

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://www.makemytrip.com");
			HomePageInit hpi = new HomePageInit(driver);
			hpi.initExecution();
	}

}
