package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import MainJavaTest.BaseClass;
import MainJavaTest.Dashboardpage;
import MainJavaTest.LoginPage;
import MainJavaTest.Pimpage;

public abstract class BaseTest extends BaseClass {

	@BeforeSuite
	public void initbrowser() {
		System.setProperty("WebDriver.Chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}
       @BeforeClass
       public void pageObjects() {
    	   loginpage = new LoginPage(driver);
    	   dashboardpage = new Dashboardpage(driver);
           pimpage = new Pimpage(driver);
       }
       @AfterClass
   	public void logOutUser() {
   		dashboardpage.logOut();
   	}

       @AfterSuite
       public void tearDownEnviroment() {
    	   driver.quit();
       }
 
       
       
}
