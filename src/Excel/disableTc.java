package Excel;
import org.testng.annotations.Test;

public class disableTc {
	
	@Test(invocationCount=10)
	public void T1()
	{
		//other Way throw sopln
		System.out.println("Execute create user");
	}

    @Test(enabled=false)
    public void createUserTest()
    {
    	System.out.println("New");
}
@Test
public void modifyUserTest()
{
	System.out.println("XXXXXXX");
}

}



