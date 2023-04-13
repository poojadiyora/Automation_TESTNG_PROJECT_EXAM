package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandOnDashBoardPage_Q1 extends BasePage {
	WebDriver driver;

	public LandOnDashBoardPage_Q1(WebDriver driver) {
		this.driver = driver;
	}
	// Test 1: Validate a user is able to add a category and once the category is
	// added it should display.

	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement CLICK_ADD_CATEGORY_BUTTON_ELEMENT;

	
	
	
	public void insertAddCategoryName(String name) {
		String insertName = name + generateRandomNum(999);
		ADD_CATEGORY_ELEMENT.sendKeys(insertName);
		// ADD_CATEGORY_ELEMENT.sendKeys(name );
	}

	public void clickAddCategoryButton() {
		CLICK_ADD_CATEGORY_BUTTON_ELEMENT.click();
		}
}
