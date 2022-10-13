package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		// Creating an account on facebook
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Create = driver.findElement(By.linkText("Create new account"));
		Create.click();
		Thread.sleep(3000);
		
		WebElement Fname=driver.findElement(By.name("firstname"));
		Fname.sendKeys("Moon");
		Thread.sleep(2000);
		WebElement Lname = driver.findElement(By.name("lastname"));
		Lname.sendKeys("Light");
		Thread.sleep(2000);
		WebElement Emailadd=driver.findElement(By.name("reg_email__"));
		Emailadd.sendKeys("+12345671809");
		Thread.sleep(2000);
		WebElement Pword=driver.findElement(By.id("password_step_input"));
		Pword.sendKeys("123er45*");
		
		WebElement months = driver.findElement(By.id("month")); 
		Select month = new Select(months); 	
		Thread.sleep(3000); 
		month.selectByVisibleText("Jan");
		
		WebElement day = driver.findElement(By.id("day")); 
		Select selectday = new Select(day); 
		Thread.sleep(3000);
		selectday.selectByIndex(10); 
		
		WebElement years = driver.findElement(By.xpath("//select[@id='year']")); 
		Select year = new Select(years);
		Thread.sleep(3000);
		year.selectByValue("2000");
		
		WebElement Toggles = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span)[3]"));
		Toggles.click();
		
		WebElement signbt = driver.findElement(By.xpath("(//button[text()='Sign Up' and @name='websubmit'])")); // XPath Text() Function and Using OR & AND
				signbt.click();
				
				/*WebElement signbt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				signbt.click();*/
		
				//driver.findElement(By.name("websubmit"));
	
	}

}
