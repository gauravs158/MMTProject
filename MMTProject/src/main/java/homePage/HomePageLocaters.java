package homePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocaters {
	
	WebDriver driver;
	
	public HomePageLocaters(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy()
	WebElement popupClose;
	
	@FindBy(xpath = "//span[normalize-space()='From']")
	WebElement from;

	String fromCityList = "//div[normalize-space()='BBI']";
	
	@FindBy(className = "lbl_input appendBottom10")
	WebElement to;
	
	String toCityList = "//div[normalize-space()='DEL']";
	
	@FindBy()
	WebElement departureDate;
	
	@FindBy()
	WebElement noOfAdults;
	
	@FindBy()
	WebElement noOfChildren;
	
	@FindBy()
	WebElement noOfInfants;
	
	@FindBy()
	WebElement chooseTravelClass;
	
	@FindBy()
	WebElement applyButton;
	
	@FindBy()
	WebElement searchButton;
	
	
	
	
	public void enterFromCity() throws InterruptedException{
		
		if(from.isEnabled())
		{
			from.click();
//			hsnCode.sendKeys("0402")
			dropdownList(from, "BBI", fromCityList);
		}
		
		System.out.println("From city entered completed.");
	}
	
	public void enterToCity() throws InterruptedException{
		
		if(from.isEnabled())
		{
			from.click();
//			hsnCode.sendKeys("0402")
			dropdownList(to, "DEL", toCityList);
		}
		
		System.out.println("To city entered completed.");
	}
	
	public void dropdownList(WebElement webele, String value, String path) throws InterruptedException {
		Thread.sleep(2000);
		webele.sendKeys(value);
		Thread.sleep(5000);
		List<WebElement> we = driver.findElements(By.xpath(path));
		Thread.sleep(5000);
		System.out.println(we.size());
		
		for(WebElement option : we)
		{
			Thread.sleep(2000);
			System.out.println(option.getText());
			
			if(option.getText().equalsIgnoreCase(value)) {
				System.out.println("================");
				System.out.println(option.getText());
				System.out.println("================");
				option.click();
				break;
			}
		}
	}

	public void enterDateOfTravel() {
		// TODO Auto-generated method stub
		
	}

	public void enterTravellerDetails() {
		// TODO Auto-generated method stub
		
		noOfAdults.sendKeys("1");
		noOfChildren.sendKeys("1");
		noOfInfants.sendKeys("2");
		
	}
}
