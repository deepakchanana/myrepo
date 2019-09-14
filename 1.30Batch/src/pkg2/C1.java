package pkg2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1
{
   public static void main(String[] args) 
   {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 //Classname reference=new Classname();
 driver.get("https://www.facebook.com");
 Options op=driver.manage();
 Window w= op.window();
 w.maximize();
 
 WebElement user=driver.findElement(By.id("email")); // uniquely identify
 user.sendKeys("deepakchanana");  // action perform
 
 WebElement password=driver.findElement(By.name("pass"));
 password.sendKeys("password1");
 
 System.out.println("changes done");

 System.out.println("changes doneee");
 
  
 
 
   }
}
