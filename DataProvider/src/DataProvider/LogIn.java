package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogIn {
	WebDriver driver;
  @Test(dataProvider="FillData")
  public void LogIntoSite(String ID, String pass) {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.id("email")).sendKeys(ID);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 
  }
  @DataProvider
  public Object[][] FillData(){
	return new Object[][]{
		new Object[]{"kiran@gmail.com","123456"},
		new Object[]{"neha@gmail.com","55555"},
		new Object[]{"np@gmail.com","sfdds"}
	};
	  
  }
}
