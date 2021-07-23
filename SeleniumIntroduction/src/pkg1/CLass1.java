package pkg1;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CLass1 
{
 public static void main(String[] args) throws InterruptedException 
 {
  System.out.println("changes done");	 
  System.setProperty("webdriver.chrome.driver","../SeleniumIntroduction/chromedriver.exe");
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://en-gb.facebook.com/");
  driver.manage().window().maximize();
  WebElement account=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
  account.click();
  Thread.sleep(5000);
  WebElement drop=driver.findElement(By.id("month"));
  Select s=new Select(drop);
  s.selectByValue("8");
  
 }
}
