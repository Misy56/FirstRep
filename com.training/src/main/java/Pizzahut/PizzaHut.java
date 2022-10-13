package Pizzahut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaHut {

	public static void main(String[] args) throws InterruptedException {
		
		// Pizza hut Delivery
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//button[@id='menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Pizza')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Cheese Pizza')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'DELIVERY')]")).click();
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("w2-address"));
		address.sendKeys("1345 Luther St W");
		WebElement apt = driver.findElement(By.name("deliveryAddress2"));
		apt.sendKeys("204");
		WebElement city= driver.findElement(By.xpath("//input[@placeholder='City']"));
		city.sendKeys("Madison");
		WebElement state=driver.findElement(By.cssSelector("input#w2-state"));
		state.sendKeys("CA");
		WebElement zip = driver.findElement(By.xpath("//input[@placeholder='XXXXX']"));
		zip.sendKeys("22055");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
