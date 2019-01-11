package Test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testNGAnnotations {
	
	@Parameters ("id")
	@Test
	public void sampleTest1(String sID) {
		
		System.out.println("called with ID: "+sID);
	}

	@Ignore
	@Parameters ("id")
	@Test
	public void sampleTest2(String sID) {
		System.out.println("called with ID: "+sID);
	}
}
