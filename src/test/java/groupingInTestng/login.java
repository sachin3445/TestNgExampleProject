package groupingInTestng;

import org.testng.annotations.Test;

public class login {
  @Test(priority=1, groups= {"Sanity"})
  public void byGmail() {
	  System.out.println("Thsi is login by Gamil");
  }
  
  @Test(priority=2, groups= {"Sanity"})
  public void byFacebook() {
	  System.out.println("Thsi is login by Facebook");
  }
  
  @Test(priority=3, groups= {"Sanity"})
  public void byAppleID() {
	  System.out.println("Thsi is login by AppleID");
  }
}
