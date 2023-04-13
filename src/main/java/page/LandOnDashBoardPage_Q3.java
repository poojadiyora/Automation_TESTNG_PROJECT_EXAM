package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandOnDashBoardPage_Q3 extends BasePage {
	WebDriver driver;

	public LandOnDashBoardPage_Q3(WebDriver driver) {
		this.driver = driver;
	}

	

	//Test 3: Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement CLICK_ON_DROPDOWN_BUTTON_ELEMENT;
	
	
	public List<String> clickOnDropdownButton() {
		return selectFromDropdown(CLICK_ON_DROPDOWN_BUTTON_ELEMENT);
}
}
