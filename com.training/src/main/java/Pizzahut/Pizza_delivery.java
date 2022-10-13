package Pizzahut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizza_delivery {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[contains(text(),'DELIVERY')]") WebElement Delivery;
	@FindBy(id = "w2-address") WebElement Street_adress;
	@FindBy(name = "deliveryAddress2") WebElement Apt;
	@FindBy(xpath = "//input[@placeholder='City']") WebElement cityName;
	@FindBy(css = "input#w2-state") WebElement State;
	@FindBy(xpath = "//input[@placeholder='XXXXX']") WebElement zip;
	@FindBy(xpath = "//button[@type='submit']") WebElement submit;
	
	public void Delivery_checkout() {
		Delivery.click();
	}
	
	public void address() {
		Street_adress.sendKeys("1234 Robert St ");
	}
	
	public void Apt_number() {
		Apt.sendKeys("204");
	}
	
	public void city_name() {
		cityName.sendKeys("Madison");
		
	}
	public void State_name() {
		State.sendKeys("CA");
	}
	public void zip_code() {
		zip.sendKeys("22055");
	}
	public void Submit_info() {
		submit.click();
	}
	
	public Pizza_delivery(WebDriver driver) { // PageFactory class or contractor.
		this.driver=driver;
		PageFactory.initElements(driver, this); // initElements - static method used to initialize web element located by @FindBy annotation 
	}
	

}
