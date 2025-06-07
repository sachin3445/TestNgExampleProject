package DataProviderDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDemo {
	WebDriver driver;
	
	@BeforeClass
    public void setup() 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize(); 
  }
  
  @Test(dataProvider="userdetails")
  public void login(String userName, String pass) 
  {
	  driver.findElement(By.name("username")).sendKeys(userName);
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  String pageTitle=driver.getTitle();
	  if (pageTitle.equals("OrangeHRM"))
	  {
		  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		  driver.findElement(By.xpath("//ul//li[4]//a[@class='oxd-userdropdown-link']")).click();
		  Assert.assertTrue(true);
	  }
	  else 
	  {
		 Assert.fail();
	  }
	  
  }
  
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }




    @DataProvider (name = "userdetails")
	Object[][] logindata()
	{
		Object logindetails [][]= { {"Admin", "admin"},
									 {"admin123", "Admin"},
									 {"Admin", "admin123"},
									 {"Admin", "xyz123"},
									 {"Admin", "qwesd"},
				
								   };
		return logindetails;
	}
    
}