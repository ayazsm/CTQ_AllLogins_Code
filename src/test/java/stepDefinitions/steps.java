package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CreateNewEpc;
import pageObjects.Loginpage;


public class steps extends BaseClass{

	public static WebDriver driver;
	

	@When("User Lunch Chrome Browser")
	public void user_lunch_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		lp = new Loginpage(driver);

		driver.manage().window().maximize();

	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);

	}

	@When("User Enter username  as {string} and password  as {string}")
	public void user_enter_username_as_and_password_as(String username, String pwd) {

		lp.txtusername(username);
		lp.txtpassword(pwd);
		System.out.println(username);
		System.out.println(pwd);

	}

	@When("Click on Login")
	public void click_on_login() {

		lp.clickLogin();

	}

	@Then("Page Title Should Be {string}")
	public void page_title_should_be(String title) {

		if (driver.getPageSource().contains("Login was unsuccessful.")) {

			driver.close();
			Assert.assertTrue(false);

		} else {

			Assert.assertEquals(title, driver.getTitle());

		}

	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {

		lp.clickLogout();
		Thread.sleep(3000);
	}

	@When("Close Browser")
	public void close_browser() {

		driver.quit();

	}
	
	
//	public void loginsceario(String username, String pwd) throws InvalidFormatException, IOException {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//
//		lp = new Loginpage(driver);
//
//		epc = new CreateNewEpc(driver);
//
//		driver.manage().window().maximize();
//
//		driver.get("http://3.6.104.4:7002/login");
//
//		lp.txtusername(username);
//		lp.txtpassword(pwd);
//		lp.clickLogin();
//
//	}

	
	@When("Click on Epc Partners")
	public void click_on_epc_partners() {

		epc.clickOnEpcPartners();

	}
//
//	@When("Click on Create new Epc Partners")
//	public void click_on_create_new_epc_partners() {
//
//		epc.clickOnNewEpc();
//
//	}
//
//	@When("user Enter Epc Name as {string} and address as #Hyderabad")
//	public void user_enter_epc_name_as_and_address_as_hyderabad(String name, String address) {
//		epc.CreateEpc(name, address);
//	}
//	
//
//	@When("Click on Submit")
//	public void click_on_submit() {
//
//		epc.clickOnSave();
//	}
	
	

	@When("Click on Create New EPC Partner")
	public void click_on_create_new_epc_partner() throws InterruptedException{
		Thread.sleep(2000);
		epc.clickOnNewEpc();
	}
	
	@When("user Enter_Epc_Name_as {string} and address as {string}")
	public void createNewEpc(String name,String address){

		epc.CreateEpc(name,address);
	}

	@When("Click on Submit")
	
	public void click_on_submit() throws InterruptedException {
		Thread.sleep(2000);
		epc.clickOnSave();
		
		String actualUrl="http://3.6.104.4:7002/administration/epc-partners";
		Assert.assertEquals(actualUrl, driver.getCurrentUrl());
	}
	

	@AfterStep
	public static void takeScreenShot(Scenario scenario) {
		try {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");

		} catch (Exception e) {

			driver.quit();
		}
	}

}
