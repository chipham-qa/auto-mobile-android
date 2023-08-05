package stepDefinitions;

import helpers.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps
{
    LoginPage loginPage;
    TestContextSetup testContextSetup;

    public LoginSteps(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }


    @Given("invalid credential")
    public void invalidCredential() {
    }

    @Given("App installed successfully")
    public void appInstalledSuccessfully() {
        
    }

    @When("User launch the app for the first time")
    public void userLaunchTheAppForTheFirstTime() {
        loginPage.waitLoginPageLoadSuccess();
    }

    @Then("They should be able to see the {string} screen")
    public void theyShouldBeAbleToSeeTheScreen(String screenName) {
        loginPage.checkPageShouldContains(screenName);
    }

    @When("user input invalid credential {string} and {string}")
    public void userInputInvalidCredentialUsernameAndPassword(String username, String password) {
        loginPage.setTextUsername(username);
        loginPage.setTextPassword(password);
        loginPage.clickLogin();
    }

    @Then("error message must be visible {string}")
    public void errorMessageMustBeVisibleErrorMessage(String errorMessage) {
        loginPage.checkPageShouldContains(errorMessage);
    }
}
