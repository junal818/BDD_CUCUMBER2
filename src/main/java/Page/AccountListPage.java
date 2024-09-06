package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {
	
	WebDriver driver;
	

	@FindBy(how = How.XPATH , using = "//button[text()= 'Add Account']") WebElement ADD_ACCOUNT_BUTTON;
	@FindBy(how = How.XPATH, using ="//span[text()='List Accounts']") WebElement LIST_ACCOUNT_LINK;
	@FindBy(how = How.XPATH, using = "//td[text()='705Junmun']") WebElement VALIDATE_ACCOUNT_LIST;
	
	
	//Constructor
	public AccountListPage(WebDriver driver)  {
		this.driver = driver;
	}
	
	public void clickOnAddAccount()
	{
		ADD_ACCOUNT_BUTTON.click();
	}
	

	public void userClicksOnListAccount() {
	    
		LIST_ACCOUNT_LINK.click();
	}
	
	public String validateAccountList()
	{
		return VALIDATE_ACCOUNT_LIST.getText();
	}

}


