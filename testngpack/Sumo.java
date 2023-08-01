package testngpack;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	
	@Test
	public void b()
	{
		Assert.fail();
		Reporter.log("sumo class method", true);
	}

}
