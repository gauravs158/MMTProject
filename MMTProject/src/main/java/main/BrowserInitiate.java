package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import homePage.HomePageInit;

public class BrowserInitiate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\chromedriver-win64\\chromedriver.exe"); 
		 * ChromeOptions options = new ChromeOptions(); 
		 * options.addArguments("start-maximized");
		 */
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.makemytrip.com");
			driver.manage().window().maximize(); 
			HomePageInit hpl = new HomePageInit(driver);
	}

}
