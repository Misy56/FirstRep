package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestSession {
  @Test // 5 Test annotation is consider as a main annotation/ main method or actual test in it 
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod //4
  public void beforeMethod() { //
	  System.out.println("This is before method annotation");
  }

  @AfterMethod //6
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass //7
  public void afterClass() {
	  System.out.println("This is after class annnottion");
  }
@Test

  public void Test6() {
	System.out.println("This is another test annotation");
}
  
  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest //8
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("This is before suit annotaton");
  }

  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
// before method and after method annotations are executed in every test 