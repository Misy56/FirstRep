package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Books {
		WebDriver driver;

	@FindBy(linkText="The Do-Over") WebElement st; // locate the element 
	
	public void stopover() {
		st.click();
	}
	
	public Books(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		/* locate WebElement
		 * create a method 
		 * create pagefactory constructor 
		 */
}
}