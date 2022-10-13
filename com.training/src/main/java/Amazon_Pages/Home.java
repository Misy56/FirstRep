package Amazon_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home { 
	WebDriver driver;
	
	@FindBy(linkText="Kindle Books") WebElement kb; // initialize page elements without Findelement 
	@FindBy(xpath="//a[@id='nav-logo-sprites']") WebElement Ilogo;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement searchfield;
	@FindBy(id = "nav-search-submit-button") WebElement  searching;
	
	/* @FindBy annotation- used in Page Factory to locate & declare web element using different locators 
	 * @FindBy(Id = elementId) WebElement element 
	 */  
	


public void KindleBooksClick() {  // creating a method
	kb.click();
}
public void LogoToClick() {
	Ilogo.click();
}

public void SearchFieldKeys() {
	searchfield.sendKeys("Alexa");
}

public void SearchToClick() {
	searching.click();
}

public Home(WebDriver driver) { // PageFactory class or contractor.
	this.driver=driver;
	PageFactory.initElements(driver, this); // initElements - static method used to initialize web element located by @FindBy annotation 
}
	
}
