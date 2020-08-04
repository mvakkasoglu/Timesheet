package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdvancedSearch;
import pages.Homepage;
import utils.SingletonBrowser;

public class AdvancedSearch_StepDefs {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	Homepage hp = new Homepage(driver);
	AdvancedSearch as = new AdvancedSearch(driver);

	@Given("User is on AutoTrader homepage")
	public void user_is_on_AutoTrader_homepage() {
		hp.goToHomepage(driver);
	}

	@Given("User clicks on Advanced Search button")
	public void user_clicks_on_Advanced_Search_button() {
		hp.Advanced_Search.click();
	}

	@Then("User enters the zip code in the text box {string}")
	public void user_enters_the_zip_code_in_the_text_box(String zipcode) {
		as.Zipcode.clear();
		as.Zipcode.sendKeys(zipcode);
	}

	@Then("User selects the {string} check box under Condition")
	public void user_selects_the_check_box_under_Condition(String string) {
		as.Check_Box_Certified.click();
	}

	@Then("User selects the {string} check box under Style")
	public void user_selects_the_check_box_under_Style(String string) {
		as.Check_Box_Convertible.click();
	}

	@Then("User updates the from Year drop down menu as {string}")
	public void user_updates_the_from_Year_drop_down_menu_as(String year) {
		as.fromYear(driver, year);
	}

	@Then("User updates the to Year drop down menu as {string}")
	public void user_updates_the_to_Year_drop_down_menu_as(String year) {
		as.toYear(driver, year);
	}
	
	@Then("User selects Make as {string} under make, Model & Trim section")
	public void user_selects_Make_as_under_make_Model_Trim_section(String make) {
	   as.make(driver, make);
	}
	
	@Then("User clicks on the Search button")
	public void user_clicks_on_the_Search_button() {
	    as.Button_Search.click();
	}


}
