package PageObjectDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_Login {
  
	WebDriver driver;
	@BeforeClass
   void setup() throws InterruptedException 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  
  @Test
   void testLogin()
  {
	  loginPage lp=new loginPage(driver);
	  lp.setUsername("Admin");
	  lp.setPasswords("admin123");
	  lp.clickLigin();
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  
  @AfterClass
   void tearDown()
  {
	  driver.quit();
  }
}
