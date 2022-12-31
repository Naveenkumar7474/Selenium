package Basiv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.co.in");
		  driver.get("https://demo.automationtesting.in/Register.html");
          JavascriptExecutor js= (JavascriptExecutor)driver;
          //js.executeScript("window.scroll(0,350)");
          WebElement x=driver.findElement(By.linkText("Automation Testing"));
          js.executeScript("arguments[0].scrollIntoView();",x);
          System.out.println(driver.getTitle());
          driver.get("https://accounts.google.com/signup");
          WebElement y=driver.findElement(By.xpath("//input[@type='checkbox']"));
          js.executeScript("arguments[0].click();",y);
          
          
          
          
          
          
}
}