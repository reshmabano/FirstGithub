package demoTestNG;

	
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class InvocationCount {

			
				@Test
				public void signUp()
				{

				System.out.println("SignUp done");

				}
				
				@Test(priority=1,invocationCount=4,invocationTimeOut=3000)
				public void login() throws InterruptedException
				{

				Thread.sleep(1000);
				System.out.println("Login done");

				}

				@Test(priority=2)
				public void viewBalance()
				{
					
				System.out.println("View Balance");

				}

	}
				



