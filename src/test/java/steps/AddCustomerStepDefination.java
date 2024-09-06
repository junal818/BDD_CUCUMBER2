package steps;

import org.openqa.selenium.support.PageFactory;

import Page.AccountListPage;
import Page.BasePage;
import Page.NewAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddCustomerStepDefination extends BasePage {
	
	NewAccountPage newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	AccountListPage accountListPage = PageFactory.initElements(driver, AccountListPage.class);
	
	
	
	@And("User enters {string} in the {string} field in accounts page")
	public void userEntersInTheFieldInAccountsPage(String value, String field) {
	 switch (field.toLowerCase()) {
	 case "accountname":
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
	 }
		 newAccountPage.enterAccountName(value);
		 break;
	 case "description":
		 newAccountPage.enterDescription(value);
		 break;
	 case "initialbalance":
		 newAccountPage.enterInitialBalance(value);
		 break;
	 case "accountnumber":
		 newAccountPage.enterAccountNumber(value);
	 case "contactperson":
		 newAccountPage.enterContactPerson(value);
		 break;
		 default:
			 System.out.println("Enter the valid credential");
	 }

}
	
	
	@Then("User should be able to validate account created successfully")
	public void validateAccountCreated() {
		
		String expected_value = "705Junmun";
		String actual_value = accountListPage.validateAccountList();
		Assert.assertEquals("acoount not found", expected_value, actual_value);
	   
	}
}



