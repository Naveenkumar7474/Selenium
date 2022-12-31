package Basiv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.co.in");
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
	    Actions action= new Actions(driver);

	   WebElement src= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
	   WebElement des= driver.findElement(By.xpath("//ol[@id='bank']"));
	   action.dragAndDrop(src, des).build().perform();
	   
			   
	}

}
