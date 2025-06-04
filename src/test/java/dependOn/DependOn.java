package dependOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOn {
  @Test(priority=1)
  public void open() {
	  System.out.println("This is Open the App");
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2,dependsOnMethods="open")
  public void login() {
	  System.out.println("This is Login to the App");
	  Assert.assertTrue(true);
  }
  
  @Test(priority=3,dependsOnMethods="open")
  public void search() {
	  System.out.println("This is open Search option in to the App");
	  Assert.assertTrue(false);
  }
  
  @Test(priority=4, dependsOnMethods="search")
  public void Advancesearch() {
	  System.out.println("This is open Advance Search option in to the App");
	  Assert.assertTrue(false);
  }
  
  @Test(priority=5)
  public void logout() {
	  System.out.println("This is Logout from the App");
	  Assert.assertTrue(true);
  }
  
}
