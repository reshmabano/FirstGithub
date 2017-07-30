package demoTestNG;


	import org.testng.annotations.Test;

		public class EnableFalse{

		@Test
		public void testLoginApp(){

		System.out.println("User is able to login successfully");
		}

		@Test(enabled=false)
		public void testRegisteruser(){

		System.out.println("User is able to register successfully");
		}

		@Test
		public void testLogoutApp(){

		System.out.println("User is able to logout successfully");
		}

	}




