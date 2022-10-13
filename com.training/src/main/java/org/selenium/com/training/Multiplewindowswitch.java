package org.selenium.com.training;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Multiplewindowswitch {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Kindle Books")));
		
		WebElement kindle=driver.findElement(By.linkText("Kindle Books"));
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		kindle.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> wind =driver.getWindowHandles();
		Iterator<String> iterator = wind.iterator();
		String Firstwindowhandle= iterator.next();
		String Seccondwhindohandle= iterator.next();
		
		//for(int i = 0; i<wind.size(); i++) {
		//	System.out.println("Sidrak "+iterator.next());
		//}
		
		driver.switchTo().window(Seccondwhindohandle);
		System.out.println(Firstwindowhandle);
		System.out.println(Seccondwhindohandle);
		
		driver.findElement(By.linkText("The Stopover")).click();
		
		
		
		driver.quit();
		
		
	}
	
	

}


