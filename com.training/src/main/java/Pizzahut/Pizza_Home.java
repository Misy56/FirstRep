package Pizzahut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizza_Home {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='menu']") WebElement Homemenu;
	@FindBy(xpath = "//div[contains(text(),'Pizza')]") WebElement MenuPizza;
	@FindBy(xpath = "//p[contains(text(),'Cheese Pizza')]") WebElement CheesePizza;
	
	
	
	public void menu() {
		Homemenu.click();
		
	}
	
	public void Pizza() {
		MenuPizza.click();
		
	}

	public void Cheese_Pizza() {
		CheesePizza.click(); 
	
	}
	

	
	public Pizza_Home(WebDriver driver) { // PageFactory class or contractor.
		this.driver=driver;
		PageFactory.initElements(driver, this); // initElements - static method used to initialize web element located by @FindBy annotation 
	}
	
}
