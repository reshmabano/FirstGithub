import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class NG {
	
@BeforeSuite
public void before(){
	
	System.out.println("Suit");
}

@AfterSuite
public void after(){
	
	System.out.println("after");
}
	

}
