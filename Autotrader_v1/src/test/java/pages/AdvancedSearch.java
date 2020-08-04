package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedSearch {
	
	public AdvancedSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goToHomepage(WebDriver driver) {
		String url = System.getProperty("url");
		if(url==null) {
			url = "https://www.autotrader.com/";
		}
		driver.get(url);
	}
	
	@FindBy (css = "[name='zip']")
	public WebElement Zipcode;
	
	@FindBy (css = "[value='CERTIFIED']")
	public WebElement Check_Box_Certified;
	
	@FindBy (css = "[value='CONVERT']")
	public WebElement Check_Box_Convertible;
	
	public static void fromYear(WebDriver driver, String year) {
		List<WebElement> list = driver.findElements(By.cssSelector("[id='4101482096']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals(year)) {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				webElement.click();
			}
		}
	}
	
	public static void toYear(WebDriver driver, String year) {
		List<WebElement> list = driver.findElements(By.cssSelector("[id='258002540']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals(year)) {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				webElement.click();
			}
		}
	}
	
	public static void make(WebDriver driver, String make) {
		List<WebElement> list = driver.findElements(By.cssSelector("[id='1970425032']"));
		for (WebElement webElement : list) {
//			System.out.println(webElement.getText());
			if(webElement.getText().equals(make)) {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				webElement.click();
			}
		}
	}
	
//	@FindBy (css = "[id='4101482096']")
//	public WebElement Year_from;
	
//	@FindBy (css = "[id='258002540']")
//	public WebElement Year_to;
//	
	@FindBy (css = "[id='1970425032']")
	public WebElement Drop_Down_Make;
	
	@FindBy (css = "[type='submit']")
	public WebElement Button_Search;
	

}
