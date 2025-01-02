package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverSetup {
	
	@Test
	public static void initiateBrowser() {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.navigate().to("https://www.makemytrip.com");
			driver.quit();
	}

}
