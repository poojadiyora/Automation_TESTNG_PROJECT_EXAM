package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
public class LandOnDashBoardPage_Q2 extends BasePage {
	WebDriver driver;

	public LandOnDashBoardPage_Q2(WebDriver driver) {
		this.driver = driver;
	}

	
	
	// Test 2: Validate a user is not able to add a duplicated category. If it does
		// then the following message will display: "The category you want to add
		// already exists: <duplicated category name>."
		
	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement ADD_CATEGORY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement CLICK_ON_ADD_CATEGORY_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body ")
	WebElement USER_LAND_ON_NEW_PAGE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Yes')]")
	WebElement USER_SHOULD_CLICK_YES_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement USER_SHOULD_LAND_ON_ORIGINAL_PAGE_ELEMENT;
	
	public void insertAddCategoryName(String name1) {
		 ADD_CATEGORY_NAME_ELEMENT.sendKeys(name1 );
		}
	public void clickAddCategoryButton() {
		CLICK_ON_ADD_CATEGORY_BUTTON_ELEMENT.click();
		}
	public void userLandOnNewPage() {
		Assert.assertEquals(USER_LAND_ON_NEW_PAGE_ELEMENT.getText(),"The category you want to add already exists:","page not found");
	}
	public void clickYesButtonToGoBackOriginalPage() {
		USER_SHOULD_CLICK_YES_BUTTON_ELEMENT.click();
		}
	public void userLandOnOriginalPageBack() {
		Assert.assertEquals(USER_SHOULD_LAND_ON_ORIGINAL_PAGE_ELEMENT.getText(), "NSS-TODO List v 1.1", "page not found");
	
		}
	}
