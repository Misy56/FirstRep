package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id = "email") WebElement FieldEmail;
	@FindBy(name = "pass") WebElement Password;
	@FindBy(name = "login") WebElement loginbt;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, null);
	}
	public void FieldToEmail(String name) {
		FieldEmail.sendKeys(name);
	}
	public void FieldToPassword(String name) {
		Password.sendKeys(name);
	}
	public void loginbt() {
		loginbt.click();
	}

}
