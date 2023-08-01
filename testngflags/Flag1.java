package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description ="this method performs login operation")
  public void login() {
	  Reporter.log("login is performed" ,true);
  }
}
