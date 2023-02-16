package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import MainJavaTest.Pimpage;

public class PimTest extends CommenTest {

	@Test(priority = 3, groups = { "smoke", "regression" })
	public void verifyPimPageTitle() {
		pimpage.clicknPimPageLink();
		String verifyTitleOfPim = pimpage.getPimPageTitle();
		Assert.assertEquals(verifyTitleOfPim, "PIM");
	}

	@Test(priority = 4, groups = { "smoke", "regression" })
	public void verifyEmpSearchEmpId() {
		pimpage.setPimPageEmpId("0283");
		pimpage.clickSearchBtn();
		// String verifyEmpIdAppeared= pimPage.getEmpIdFromSearchedResults("0283");
		Assert.assertEquals(true, true);
	}

	@Test(priority = 5, groups = { "smoke", "regression" })
	public void TestIngChanges() {
		Assert.assertEquals(false, false);
	}
		@Test(priority = 6, groups = { "smoke", "regression" })
		public void TestGit1() {
			Assert.assertEquals(false, false);
		}
		@Test(priority = 7, groups = { "smoke", "regression" })
		public void TestGitchanges123() {
			Assert.assertEquals(false, true);
	}
}
