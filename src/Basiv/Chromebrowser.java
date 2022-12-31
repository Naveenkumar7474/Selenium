package Basiv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("fgfg");
  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
  
  WebDriver driver=new ChromeDriver();
  driver.get("http://www.google.co.in");
 driver.get("https://www.flipkart.com/");
  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("gthgd");
 // driver.findElement(By.("<input autocomplete=\"off\" type=\"text\" class=\"_2IX_2- VJZDxU\" value=\"\">")).sendKeys("gffghfg")
  //driver.quit();

}}
