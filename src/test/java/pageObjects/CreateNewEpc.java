package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptUtilMethods;

public class CreateNewEpc {

	public WebDriver edriver;
	
	public CreateNewEpc(WebDriver rdriver) {		
		edriver=rdriver;
		PageFactory.initElements( rdriver,true);
	}

	
	public void clickOnEpcPartners() {
		
		WebElement am=edriver.findElement(By.xpath("//div[@class='menu-item menu-accordion hover show']//span[@class='menu-link']//span[@class='menu-title']"));
		JavaScriptUtilMethods.clickElementByJs(am,edriver);
		edriver.findElement(By.xpath("//a[@class='menu-link menu-link active']//span[@class='menu-title']")).click();
	}
	
	public void clickOnNewEpc() {
		edriver.findElement(By.xpath("//div[contains(@data-bs-original-title,'Click to add a record')]//a[contains(@class,'btn btn-sm btn-flex btn-light-primary')]")).click();
	}
	
	public void CreateEpc(String name,String address) {
		
		edriver.findElement(By.xpath("//input[@placeholder='Max 25 characters']")).sendKeys(name);
		edriver.findElement(By.xpath("//textarea[@placeholder='Max 150 characters']")).sendKeys(address);
	}
	
	public void clickOnSave() {
		edriver.findElement(By.xpath("//button[@id='kt_modal_new_target_submit']")).click();
	}
}
