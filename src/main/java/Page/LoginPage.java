package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement userName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//strong[text()='Dashboard']") WebElement DashBoardPage;
	@FindBy(how = How.XPATH, using = "//span[contains (text(), 'Codefios')]") WebElement login_page;
	
	public String getLoginPageTitle()
	{
		return login_page.getText();
	}
	
	//Method to interact with the elements
	public void enterUserName(String username) {
		userName.sendKeys(username);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getDashboradPageTitle() {
		return DashBoardPage.getText();
	}
}

