package Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommenTest extends BaseTest {

	@BeforeClass
	public void login() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		loginpage.clicklogin();
		String titleOfDash= dashboardpage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "Dashboard");
	}
}

