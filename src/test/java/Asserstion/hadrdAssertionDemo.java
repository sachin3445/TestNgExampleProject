package Asserstion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hadrdAssertionDemo {
  @Test
  public void testTitle() {
	  
	  String actTitle="Amazon";
	  String expTitle="Amazon";
	  
	  Assert.assertEquals(actTitle, expTitle);
  }
}
