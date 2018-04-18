package Excel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void verify()
	{
		System.out.println("Step-1");
		System.out.println("Step-2");
		Assert.assertEquals("A", "B");
		System.out.println("step-3");
}
	@Test
	public void Verifyy()
	{
		System.out.println("Step-1000");
	}
}


