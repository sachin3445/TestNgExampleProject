package groupingInTestng;

import org.testng.annotations.Test;

public class payment {
  @Test(priority=1, groups= {"Regression", "Sanity", "Functional"})
  public void paymentByRupee() {
	  System.out.println("Payment accept by Rupee");
  }
  
  @Test(priority=2, groups= {"Regression", "Sanity", "Functional"})
  public void paymentByDollar() {
	  System.out.println("Payment accept by Dollar");
  }
  
}
