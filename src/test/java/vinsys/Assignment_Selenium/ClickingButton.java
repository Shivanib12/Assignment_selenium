package vinsys.Assignment_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickingButton {

  ChromeDriver driver;
  //WebDriver driver;
  
  @Test
  public void ForgetPassword() throws InterruptedException
  {
      
      driver.findElementByLinkText("Forgot your password?").click();
      String ExpURL="https://www.facebook.com";
      String ActURL=driver.getCurrentUrl();
      Assert.assertEquals(ExpURL, ActURL);
      //Navigate back to Login Back
      driver.navigate().back();
      System.out.println(driver.findElementById("btnLogin").isDisplayed());
      //Navigate Forward 
      driver.navigate().forward();
      String ExpURLForward="https://www.facebook.com";
      String ActURLForward=driver.getCurrentUrl();
      Assert.assertEquals(ExpURLForward, ActURLForward);
      
  }
  //Pre-Condition
@BeforeTest
  public void LaunchBrowser(){
       WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          
          driver.navigate().to("https://www.facebook.com");
          
  }
  //Post Condition
  @AfterTest
  public void CloseBrowser(){
      driver.quit();
  }

}
