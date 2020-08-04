package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;
import utils.SingletonBrowser;

public class Homepage_StepDefs {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	Homepage hp = new Homepage(driver);
	
	@Given("User is on Autotrader homepage")
	public void user_is_on_Autotrader_homepage() {
		hp.goToHomepage(driver);
	}

	@Given("Verify first button is present {string}")
	public void verify_first_button_is_present(String string) {
		hp.Browse_by_Make.isDisplayed();
	}

	@Then("Verify second button is present {string}")
	public void verify_second_button_is_present(String string) {
		hp.Browse_by_Style.isDisplayed();
	}

	@Then("Verify third button is present {string}")
	public void verify_third_button_is_present(String string) {
		hp.Advanced_Search.isDisplayed();
	}

	@Then("Verify Search button is present")
	public void verify_Search_button_is_present() {
		hp.Button_Search.isDisplayed();
	}

	@Then("Verify drop down menu Make is present")
	public void verify_drop_down_menu_Make_is_present() {
		hp.Drop_Down_Make.isDisplayed();
	}

	@Then("Verify drop down menu Model is present")
	public void verify_drop_down_menu_Model_is_present() {
		 hp.Drop_Down_Model.isDisplayed();
	}

}
