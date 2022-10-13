package PizzahutTest;



import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import Pizzahut.Pizza_Home;
import Pizzahut.Pizza_delivery;


import org.testng.annotations.BeforeClass;

public class PizzaTest {
	
WebDriver driver;

 @Test(priority = 1)
  public void f() {
	  
	  Pizza_Home Home_page= new Pizza_Home( driver);
	  Home_page.menu();
	  Home_page.Pizza();
	  Home_page.Cheese_Pizza();
	  
	 
	  
  }
  @Test(dependsOnMethods="f")
  
  public void P_Delivery() {
	  Pizza_delivery Delivery= new Pizza_delivery(driver);
	  Delivery.address();
	  Delivery.Apt_number();
	  Delivery.city_name();
	  Delivery.State_name();
	  Delivery.zip_code();
	  Delivery.Submit_info();
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	  
  }
/*
  @AfterClass
  public void afterClass() {
	  
	  
	  //Screenshots();
	driver.close();
	   
  } */
  
  public void Screenshots() throws IOException, InterruptedException {
		
		Date ob= new Date();
		System.out.println(ob);
		String files=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
		
		File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\home.png"));  // coping z screen shots
		FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\"+files+"home.png")); 
		Thread.sleep(3000);
		
	
	}
  

}
