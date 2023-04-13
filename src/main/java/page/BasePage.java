package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.BrowserFactory;

public class BasePage {

	
	public  BrowserFactory dropdown = new BrowserFactory ();
			
			
	public int generateRandomNum(int boundaryNum) {
		Random rnd = new Random();
	int generateNum = 	rnd.nextInt(boundaryNum);
		return  generateNum;
	}
//	public void selectFromDropdown(WebElement element) {
//		Select sel = new Select(element);
//		List<WebElement> options = sel.getOptions();
//		
//		for(int i = 0; i< options.size(); i++) {
//			options.get(i).getText();//actual value
//			expectedOption[i];
//		}
	//}
//	public void selectFromDropdown(WebElement element,String VisibleText) {
//		Select sel = new Select(element);
//		sel.selectByVisibleText(VisibleText);
//	}
	
	public List<String> selectFromDropdown(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		List<String > actualContaint = new ArrayList<String>();
		
		for(     WebElement ele  :   options ) {
			actualContaint.add(ele.getText());
		}
		return actualContaint;
	} 
}
	