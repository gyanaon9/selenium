package Naveen;

import org.junit.Test;

public class TimeOutException {
	
	@Test(timeout=2000)
	public void infintLoop()
	{
		int i=1;
		while(i==1){
			
		
		System.out.println(i);
	}
	}
}
