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
	
	@FindBy(xpath="//span[@class='commonModal__close']")
	WebElement popupClose;
	
	@FindBy(xpath="//li[@data-cy='oneWayTrip']/span")
	WebElement oneWay;
	
	@FindBy(xpath="//li[@data-cy='roundTrip']/span")
	WebElement roundTrip;
	
	@FindBy(xpath="//li[@data-cy='mulitiCityTrip']/span")
	WebElement multiCityTrip;
	
	@FindBy(id = "fromCity")
	WebElement from;
	
	String fromAutoSuggestList = "//div[normalize-space()='BBI']";
			
	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement fromTextBox;
	
	@FindBy(id = "toCity")
	WebElement to;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement toTextBox;
	
	String toAutoSuggestList = "//span[normalize-space()='DEL']";
	
	@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--selected']")
	WebElement departureDate;
	
	@FindBy(xpath="//span[contains(text(),\"Travellers & Class\")]")
	WebElement travellerAndClass;	
	
	@FindBy()
	WebElement returnDate;
	
	@FindBy(xpath="(//li[@data-cy='adults-2'])")
	WebElement noOfAdults;
	
	//String nofAdults = "(//li[@data-cy='adults-"+number+"'])";
	
	@FindBy(xpath="(//li[@data-cy='children-2'])")
	WebElement noOfChildren;
	
	@FindBy(xpath="(//li[@data-cy='infants-2'])")
	WebElement noOfInfants;
	
	@FindBy(xpath="(//li[@data-cy='travelClass-3'])")
	WebElement chooseTravelClass;
	
	@FindBy(xpath="(//button[@data-cy='travellerApplyBtn'])")
	WebElement applyButton;
	
	@FindBy(xpath="(//p[@data-cy='travellerText'])")
	WebElement travellerCountAsDisplayed;
	
	@FindBy(xpath="//a[normalize-space()='Search']")
	WebElement searchButton;
	
	
	public void closePopup() {
        
        if(popupClose.isDisplayed())
        {
            popupClose.click();
        }
	}
	
	public void chooseTripType(String tripType) {
		
		if(tripType.equalsIgnoreCase("oneWay")) {
			oneWay.click();
		}
		else if(tripType.equalsIgnoreCase("roundTrip")) {
			roundTrip.click();
		}
		else if(tripType.equalsIgnoreCase("multiCityTrip")) {
			multiCityTrip.click();
		}
	}
	
	public void enterFromCity() throws InterruptedException{
		
		if(from.isEnabled())
		{
			from.click();
			dropdownList(fromTextBox, "BBI", fromAutoSuggestList);
		}
		
		System.out.println("From city entered completed.");
	}
	
	public void enterToCity() throws InterruptedException{
		
		if(to.isEnabled())
		{
			to.click();
			dropdownList(toTextBox, "DEL", toAutoSuggestList);
		}
		
		System.out.println("To city entered completed.");
	}

	public void enterDateOfTravel() {
		
		departureDate.click();
	}

	public void enterDateOfReturn() {
		
		returnDate.click();
	}

	public void enterTravellerDetails() {
		
		travellerAndClass.click();
		noOfAdults.click();
		noOfChildren.click();
		noOfInfants.click();
		applyButton.click();
		System.out.println(travellerCountAsDisplayed.getText());
		searchFlights();
	}
	
	public void searchFlights() {

		searchButton.click();
		driver.quit();
	}
	
	public void dropdownList(WebElement webele, String value, String element) throws InterruptedException {
		//Thread.sleep(2000);
		webele.sendKeys(value);
		//Thread.sleep(2000);
		List<WebElement> we = driver.findElements(By.xpath(element));
		//Thread.sleep(5000);
		System.out.println(we.size());
		
		for(WebElement option : we)
		{
			//Thread.sleep(2000);
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
}
