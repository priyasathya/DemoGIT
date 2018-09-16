package Testn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass {
	@BeforeSuite
    public void beforeSuite()
    {
        System.out.println("In Before Suite Method");
    }
	 @AfterSuite
	    public void afterSuite()
	    {
	        System.out.println("In After Suite Method");
	    }
	 @BeforeTest
	    public void beforeTest()
	    {
	        System.out.println("In Before Test Method");
	    }
	     
	 @AfterTest
	    public void afterTest()
	    {
	        System.out.println("In After Test Method");
	    }
	 @BeforeClass
	    public void beforeClass()
	    {
	        System.out.println("In Before Class Method");
	    }
	 @AfterClass
	    public void afterClass()
	    {
	        System.out.println("In AfterClass Method");
	    }
	 @BeforeMethod
	    public void beforeMethod()
	    {
	        System.out.println("In BeforeMethod Method");
	    }
	 @AfterMethod
	    public void afterMethod()
	    {
	        System.out.println("In AfterMethod Method");
	    }
	 @Test
	 public void Test1(){
		 System.out.println("Test method ");
		 
	 }

}
