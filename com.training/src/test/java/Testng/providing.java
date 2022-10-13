package Testng;

import org.testng.annotations.Test;

import Facebook.Home;
import common.Utilities;

import org.testng.annotations.DataProvider;

public class providing extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Home home= new Home(driver);
	  home.FieldToEmail(n);
	  Thread.sleep(6000);
	  home.FieldToPassword(s);
	  Thread.sleep(6000);
	  home.loginbt();
	  Thread.sleep(6000);
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tested", "password" },
      new Object[] { "tested22", "b8" },
      new Object[] { " ", "b8" },
    };
  }
}
