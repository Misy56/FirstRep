package org.selenium.com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import org.openqa.selenium.edge.EdgeDriver;


public class Keys {

	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/ 
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa");
		
		Actions ob= new Actions(driver);
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(org.openqa.selenium.Keys.CONTROL);
		
		Thread.sleep(5000);
		ob.sendKeys(org.openqa.selenium.Keys.DELETE).build().perform();
		Thread.sleep(4000);
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		
		driver.close();
		

	}

}
