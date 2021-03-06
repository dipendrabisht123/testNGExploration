package Test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExample {
	
	@Test(enabled=false)
	public void testCaseEnabling(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	
	@Test
	public void testCaseSkipException(){
			System.out.println("Im in testCaseSkipException");
			throw new SkipException("Skipping this exception");
		}

	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip Exception");
		if(true)
			throw new SkipException("Skipping this exception");
		System.out.println("ConditionalSkipException: Executed Successfully");
	}

}
