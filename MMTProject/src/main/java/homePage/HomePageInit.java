package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageInit {

	private WebDriver driver;


	public HomePageInit(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void initExecution() {
		
		HomePageLocaters hpl = new HomePageLocaters(driver);
		try {
			hpl.closePopup();
			//Thread.sleep(2000);
			hpl.chooseTripType("roundTrip");
			//Thread.sleep(2000);
			hpl.chooseTripType("oneWay");
			//Thread.sleep(2000);
			hpl.enterFromCity();
			//Thread.sleep(2000);
			hpl.enterToCity();
			//Thread.sleep(2000);
			hpl.enterDateOfTravel();
			//Thread.sleep(2000);
			hpl.enterTravellerDetails();
			//Thread.sleep(2000);

			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
