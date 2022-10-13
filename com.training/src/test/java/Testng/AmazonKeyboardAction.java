package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.Keys;
public class AmazonKeyboardAction {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException { //
	  
	  Thread.sleep(3000);
	  	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa");
	  	Actions ob= new Actions(driver);
	  	
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL);
		
		Thread.sleep(5000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(4000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
	  	driver= new ChromeDriver();
	  
	  	driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa");

		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
