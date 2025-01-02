package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageInit {

	private WebDriver driver;

	public HomePageInit(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void initExecution() {
		
		HomePageLocaters hpl = new HomePageLocaters(driver);
		try {
			hpl.enterFromCity();
			hpl.enterToCity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
