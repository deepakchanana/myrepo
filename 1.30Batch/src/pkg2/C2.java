package pkg2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.xalan.xsltc.dom.ArrayNodeListIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C2 
{
  public static void main(String[] args) throws InterruptedException 
  {
	
	  ChromeDriver driver=new ChromeDriver();
	
	  Thread.sleep(5000); // it will wait for 5 second for the next statement
	  driver.get("url");
	  WebElement button=driver.findElement(By.id("id"));
	  WebDriverWait w=new WebDriverWait(driver, 5);
	  w.until(ExpectedConditions.elementToBeClickable(button));
	  w.until(ExpectedConditions.textToBePresentInElement("button","Deepak"));
	  
	  System.out.println("changed");
	  
  }
}
