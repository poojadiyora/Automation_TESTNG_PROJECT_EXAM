package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LandOnDashBoardPage_Q1;
import page.LandOnDashBoardPage_Q2;
import page.LandOnDashBoardPage_Q3;
import util.BrowserFactory;

public class DashBoardTest  
// extends BasePage 
{
	WebDriver driver;
	String addname = "book";
	String addName = "selenium";
	//List<String>expectedOption[] = ("None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
	LandOnDashBoardPage_Q1 dbs;
	LandOnDashBoardPage_Q2 dbs2;
	LandOnDashBoardPage_Q3 dbs3;
	@Test(priority =1)
	public void userShouldLandOnDashboardPage() throws InterruptedException {
		driver = BrowserFactory.init();
		 dbs = PageFactory.initElements(driver, LandOnDashBoardPage_Q1.class);
		dbs.insertAddCategoryName( addname);
		Thread.sleep(3000);
		dbs.clickAddCategoryButton();
	}
	
	@Test(priority =3)
	public void userShouldAddCtegory() throws InterruptedException {
		dbs2 = PageFactory.initElements(driver, LandOnDashBoardPage_Q2.class);
		
		dbs2.insertAddCategoryName(addName);
		Thread.sleep(5000);
		dbs2.clickAddCategoryButton();
		Thread.sleep(3000);
		dbs2.clickYesButtonToGoBackOriginalPage();
		Thread.sleep(3000);
		dbs2.userLandOnOriginalPageBack();
	}
	@Test(priority =2)
	public void valiateMonthDropdown() throws InterruptedException {
		 dbs3 = PageFactory.initElements(driver, LandOnDashBoardPage_Q3.class);
		List<String> actualVlues = dbs3.clickOnDropdownButton();
		Thread.sleep(5000);
		List<String>expectedOption = Arrays.asList("None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
		System.out.println(expectedOption);
		Thread.sleep(5000);
		;
		
	}
	}
