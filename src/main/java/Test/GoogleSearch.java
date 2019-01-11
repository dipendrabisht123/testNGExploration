package Test;

import org.testng.annotations.Test;

import Page.GoogleSearchPage;
import Test.Base.TestBase;

public class GoogleSearch extends TestBase{

	@Test(enabled=true)
	public void testCaseEnabling(){
		GoogleSearchPage gsp = new GoogleSearchPage();
		gsp.searchText("Synechron Bangalore");
		
		}
}
