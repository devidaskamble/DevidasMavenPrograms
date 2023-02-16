package MainJavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtloginPage;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(tagName = "button")
	WebElement btnLogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String gettitleofBuild() {
		String str = driver.getTitle();
		return str;

	}
	public String gettitleofUrl() {
		String str = driver.getCurrentUrl();
		return str;
	}

	public String gettitleofPage() {
		String str = txtloginPage.getText();
		return str;
	}

	public void setUserName(String usrname) {
		username.sendKeys(usrname);
	}

	public void setPassword(String password) {
		pass.sendKeys(password);
	}

	public void clicklogin() {
		btnLogin.click();
	}
}
