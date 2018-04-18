package Pratice;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class SoftAst {

		@Test
		public void verifyLogin() {
			System.out.println("Step-1");
			System.out.println("step-2");
			
		
			//Soft-Assert
			org.testng.asserts.SoftAssert ob = new org.testng.asserts.SoftAssert();
			ob.assertEquals("A", "B");
			System.out.println("Step-3");
			ob.assertEquals("X", "Y");
			
			//HARD--ASSERT
			Assert.assertEquals("A","B");
			System.out.println("Step-3");
			
		}
	}



