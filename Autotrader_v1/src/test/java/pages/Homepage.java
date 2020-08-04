package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goToHomepage(WebDriver driver) {
		String url = System.getProperty("url");
		if(url==null) {
			url = "https://www.autotrader.com/";
		}
		driver.get(url);
	}
	@FindBy (css="[title='Browse by Make']")
	public WebElement Browse_by_Make;
	
	@FindBy (css="[title='Browse by Style']")
	public WebElement Browse_by_Style;
	
	@FindBy (css="[class = 'text-size-5 text-size-sm-10 text-link text-bold padding-0 text-white']")
	public WebElement Advanced_Search;
	
	@FindBy (css = "[id = 'search']")
	public WebElement Button_Search;
	
	@FindBy (css = "[id = 'makeCode']")
	public WebElement Drop_Down_Make;
	
	@FindBy (css = "[id = 'ModelCode']")
	public WebElement Drop_Down_Model;

}
