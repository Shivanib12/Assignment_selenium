package vinsys.Assignment_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleWebPage {
  @Test
  public void verifyTitle(){
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		  //ChromeDriver driver = new ChromeDriver();
		   // driver.get("https://www.google.com");
		   
		   driver.manage().window().maximize();
		   String url="https://www.google.com";
			driver.get(url);
			System.out.println(driver.getTitle());
			driver.close();
		}
}  
