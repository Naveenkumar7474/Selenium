package Basiv;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
   static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
		   driver=new ChromeDriver();
		 // driver.get("http://www.google.co.in");
		  driver.get("http://accounts.google.com/signup");
		  screenShot("application");
		  driver.findElement(By.id("firstName")).sendKeys("adfdfs");
		  screenShot("firstname");
		  
	}
		  public static void screenShot(String fileName) throws IOException
		  {
			 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  File des=new File("./ScreenShot/"+fileName+".png");
		  FileUtils.copyFile(src,des);
		  
	}

}
