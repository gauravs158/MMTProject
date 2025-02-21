package stepDefinitionFiles;

import io.cucumber.java.en.*;

public class MMTHappyPath {
		
	@Given("the user is in MakeMyTrip homepage")
	public void the_user_is_in_make_my_trip_homepage() {

		System.out.println("the user is in MakeMyTrip homepage");
	}

	@When("the user clicks oneWay")
	public void the_user_clicks_one_way() {

		System.out.println("the user clicks oneWay");
	}

	@And("the user enters fromCity details")
	public void the_user_enters_from_city_details() {

		System.out.println("the user enters fromCity details");
	}

	@And("the user enters toCity details")
	public void the_user_enters_to_city_details() {

		System.out.println("the user enters toCity details");
	}

	@And("the user enters departure date")
	public void the_user_enters_departure_date() {

		System.out.println("the user enters departure date");
	}

	@And("the user enters number of adults as two")
	public void the_user_enters_number_of_adults_as_two() {

		System.out.println("the user enters number of adults as two");
	}

	@And("the user enters number of children as two")
	public void the_user_enters_number_of_children_as_two() {

		System.out.println("the user enters number of children as two");
	}

	@And("the user enters number of infants as two")
	public void the_user_enters_number_of_infants_as_two() {

		System.out.println("the user enters number of infants as two");
	}

	@And("the user chooses FirstClass in travel class")
	public void the_user_chooses_first_class_in_travel_class() {

		System.out.println("the user chooses FirstClass in travel class");
	}

	@And("the user clicks Apply button")
	public void the_user_clicks_apply_button() {

		System.out.println("the user clicks Apply button");
	}

	@Then("total number of travellers is displayed as six")
	public void total_number_of_travellers_is_displayed_as_six() {

		System.out.println("total number of travellers is displayed as six");
	}
}
