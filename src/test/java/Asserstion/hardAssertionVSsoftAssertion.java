package Asserstion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssertionVSsoftAssertion {
  @Test
  public void hardAssertionDemo() {
	  System.out.println("This is statement excute if assertion only true ");
	  
	  Assert.assertEquals(1, 1);
	  
	  System.out.println("This is statement excute if assertion does not false");
  }
  
  @Test
  public void softAssertionDemo() {
	  System.out.println("This is statement excute if soft assertion only true ");
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(1, 2);
	  
	  System.out.println("This is statement excute if soft assertion does not false");
	  sa.assertAll();
  }
}
