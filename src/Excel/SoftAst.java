package Excel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAst {

	@Test
	public void verify()
	{
		System.out.println("Step-1");
		System.out.println("Step-2");
    	SoftAssert d=new SoftAssert();
		d.assertEquals("A", "a");
		System.out.println("step-3");
     d.assertAll();
	}

}
