	package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import MainJavaTest.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyTitle() {
		Assert.assertEquals(loginpage.gettitleofBuild(), "OrangeHRM");
	}
	@Test(priority = 2)
	public void verifyUrl() {
		Assert.assertEquals(loginpage.gettitleofUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 3)
	public void verifytext() {
		Assert.assertEquals(loginpage.gettitleofPage(), "Login");
	}

	@Test(priority = 4)
	public void VerifyLoginWithCorrectCredentials() {
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		loginpage.clicklogin();
		Assert.assertEquals(dashboardpage.gettitleofDashBard(), "Dashboard");

	}
}
