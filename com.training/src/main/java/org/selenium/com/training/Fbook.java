package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement UserField=driver.findElement(By.id("email")); // save it in to a variable 
		UserField.sendKeys("people");
		WebElement PassField= driver.findElement(By.name("pass"));
		PassField.sendKeys("pass");
		Thread.sleep(2000);
		WebElement Log = driver.findElement(By.tagName("button"));
		Log.click();
		
		//Thread.sleep(3000);
		/*WebElement Forgot=driver.findElement(By.linkText("Forgot password?"));
		Forgot.click();// link text */
		
		//WebElement Forgot=driver.findElement(By.linkText("Forgot password"));
		//Forgot.click();// partiallink text
		
		WebElement Forgot=driver.findElement(By.xpath("//*[contains(text(),'Forgot password?')]"));
		Forgot.click(); // xpath contains 
		
		WebElement CreatAnAccount = driver.findElement(By.linkText("Creat new account"));
		CreatAnAccount.click();
		
		WebElement Month=driver.findElement(By.name("birthday_monthy"));
		Select ob=new Select(Month);
		ob.selectByIndex(5);
		
		WebElement bday=driver.findElement(By.name("birthday_day"));
		Select obj= new Select(bday);
		obj.selectByValue("6");
		
		WebElement Toggles = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/div/div/input)[3] "));
		Toggles.click();
		
		int linked=driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of =" +linked);
		
		driver.close();

	}

}
