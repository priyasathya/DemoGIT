package Testn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class ParameterizedTestng {
	
	@Parameters({"Suite level param"})
	public void Test1(String param){
		System.out.println("Test1 :"+param);

}
	
	@Parameters({"Test level param"})
	public void Test2(String param){
		System.out.println("Test2 :"+param);
	}
	
	@Parameters({"Suite level param","Test level param"})
	public void Test3(String param1 ,String param2){
		System.out.println("Test3 param1 :"+param1 +"Test3 param2 :"+param2);
	}
}