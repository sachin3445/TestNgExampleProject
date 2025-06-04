package TestNg01;
/*Open
 *Logo
 *Login 
 *Close 
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
	
	WebDriver driver;
  @Test(priority=1)
 void open()
 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
 void logo() throws InterruptedException
 {
	 Thread.sleep(3000); 
	 boolean logoStatus = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 System.out.println("Logo displayed status: "+logoStatus);
 }
  @Test(priority=3)
 void login()
 {
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
  @Test(priority=4) 
 void close()
 {
	driver.close(); 
 }
}
