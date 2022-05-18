package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement txtusername;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath = "//button[@id='kt_sign_in_submit']//span[@class='indicator-label']")
	@CacheLookup
	WebElement btnlogin;

	@FindBy(xpath = "//span[@class='svg-icon svg-icon-muted svg-icon-1']//*[name()='svg']")
	@CacheLookup
	WebElement btnLogout;

	public void txtusername(String username) {

		txtusername.sendKeys(username);
	}

	public void txtpassword(String password) {

		txtpassword.sendKeys(password);
	}

	public void clickLogin() {

		btnlogin.click();

	}
	

	public void clickLogout() {

		btnLogout.click();
		ldriver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();

	}

}
