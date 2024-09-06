package steps;

import org.openqa.selenium.support.PageFactory;

import Page.AccountListPage;
import Page.BasePage;
import Page.LoginPage;
import Page.NewAccountPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefination extends BasePage {

	LoginPage loginPage;
	AccountListPage accountListPage;
	NewAccountPage newAccountPage;

	@Before
	public void launchChrome() {

		openChrome();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		accountListPage = PageFactory.initElements(driver, AccountListPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	}
	@Given("User is on the codefios login page")
	public void userIsOnTheCodefiosLoginpage() {
		driver.get("https://codefios.com/ebilling");
	    String expectedValue = "Codefios";
	    String actualValue = loginPage.getLoginPageTitle();
	    Assert.assertEquals("Login page not found", actualValue, expectedValue);
	    screenshot( driver);
	}
	@When("User enters the {string} in the {string} field")
	public void userEnterUserNameAndPassword(String loginData, String field) {

		if (field.equalsIgnoreCase("userName")) {
			loginPage.enterUserName(loginData);
		} else if (field.equalsIgnoreCase("Password")) {
			loginPage.enterPassword(loginData);
		} else {
			System.out.println("Enter valid login data:" + loginData + "Field:" + field);
		}
	}

	@And ("User clicks on {string}")
	public void userClicksOnButton(String field) throws InterruptedException
	{
		
		
		switch (field) {
        case "listAccounts":
        	Thread.sleep(5000);
        	accountListPage.userClicksOnListAccount();
            break;
        case "login":
        	loginPage.clickSignInButton();
            break;
        case "addAccount":
       	    accountListPage.clickOnAddAccount();
       	    break;
        case "Save":
        	newAccountPage.clickOnSave();
		}
	}

	@Then("User should land on Dashboard page")
	public void validateDashboardPage() {

		String expectedTitle = "Dashboard";
		String actualTitle = loginPage.getDashboradPageTitle();
		Assert.assertEquals("DashBoard page not found", actualTitle, expectedTitle);
		screenshot( driver);

	}

}
