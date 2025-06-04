package groupingInTestng;

import org.testng.annotations.Test;

public class signup {
  @Test(priority=1, groups= {"Regression"})
  public void signupByGmail() {
	  System.out.println("Signup by Gamil");
  }
  
  @Test(priority=2, groups= {"Regression"})
  public void signupByFacebook() {
	  System.out.println("Signup by Facebook");
  }
  
  @Test(priority=3, groups= {"Regression"})
  public void signupByAppleAccount() {
	  System.out.println("Signup by Apple Account");
  }
}
