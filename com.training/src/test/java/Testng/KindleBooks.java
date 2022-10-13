package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Amazon_Pages.Home;
import common.Utilities;


public class KindleBooks extends Utilities{
	
	
  @Test(priority=1)
  public void f() {
	  
	  Home home= new Home(driver);
	  home.KindleBooksClick();
	  String ur = driver.getCurrentUrl();
	  System.out.println(ur);
	  System.out.println("This is before Assert");
	  
	  SoftAssert sk= new SoftAssert();
	  sk.assertEquals(ur, "https://www.amazon.com/kindle-dbs/storefront?storeType=browse&node=154606011");
	  System.out.println("This is after Assert");
	  
	  /*Books books= new Books(driver);
	  books.stopover();
	  StopOver stopover= new StopOver(driver);
	  stopover.ReadListenclick();
	  */
	  
	  int linked=driver.findElements(By.tagName("a")).size();
	  System.out.println("Total number for links= "+linked);
	  int homelinked=driver.findElements(By.linkText("Amazon Home")).size();
	  System.out.println("Amazon home count= "+homelinked);
	  
	  if(homelinked==1) {
		  driver.findElement(By.linkText("Amazon Home")).click();
	  }
	  else {
		  System.out.println("Element is not displaying");
	  }
	  sk.assertAll();
	
  }
  
  
  @Test(priority=2)
  public void SearchFieldVerification() {
	  Home home= new Home(driver);
	  home.LogoToClick();
	  home.SearchFieldKeys();
	  home.SearchToClick();
  }
}
  
  
  /*
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  Ibrowsers("Chrome");
	  	
	  /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
	  	driver= new ChromeDriver();
	  
	  	driver.get("https://www.amazon.com");
	  	Thread.sleep(4000);
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	  
	  Screenshots();
	  driver.close();
  }
  
  private  void Ibrowsers(String NameOfBrowsers) {
		
		if(NameOfBrowsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			
		} else if(NameOfBrowsers.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\conta\\eclipse-workspace\\com.training\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
		}
	}
  
  public void Screenshots() throws IOException, InterruptedException {
		
		Date ob= new Date();
		System.out.println(ob);
		String files=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
		
		File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\home.png"));  // coping z screen shots
		FileHandler.copy(Homepage, new File("C:\\Users\\conta\\eclipse-workspace\\com.training\\pictures\\"+files+"home.png")); 
		Thread.sleep(3000);
		
	
	}*/


