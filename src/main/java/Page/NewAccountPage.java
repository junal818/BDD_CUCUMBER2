package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_name\"]") WebElement accountNameField;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"description\"]") WebElement descriptionField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]") WebElement initialBalanceField;

    @FindBy(how = How.XPATH,using = "//*[@id=\"account_number\"]") WebElement accountNumberField;

    @FindBy(how = How.XPATH,using  = "//*[@id=\"contact_person\"]") WebElement contactPersonField;
    
    @FindBy(how = How.XPATH,using  = "//*[@id=\"accountSave\"]") WebElement account_save;

    
    //Constructor
    public NewAccountPage(WebDriver driver) {
    	this.driver = driver;
    }
    

    public void enterAccountName(String accountName)
    {
    	accountNameField.sendKeys(accountName);
    }
    
    public void enterDescription(String description)
    {
    	descriptionField.sendKeys(description);
    }
    
    public void enterInitialBalance(String initialBalance)
    {
    	initialBalanceField.sendKeys(initialBalance);
    }
    
    public void enterAccountNumber(String accountNumber)
    {
    	accountNumberField.sendKeys(accountNumber);
    }
    
    public void enterContactPerson(String contactPerson)
    {
    	contactPersonField.sendKeys(contactPerson);
    }
    
    public void clickOnSave()
    {
    	account_save.click();
    }
}


