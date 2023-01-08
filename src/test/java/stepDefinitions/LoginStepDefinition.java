package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStepDefinition {

    LoginPage login = new LoginPage(Hooks.driver);

    @Given("user navigates to login page")
    public void navigateLoginPage() {
        login.loginNavigateBtn.click();
    }

    @When("user enters email {string} and password {string}")
    public void enterData(String email, String password) {
        login.emailTxtFld.sendKeys(email);
        login.passwordTxtFld.sendKeys(password);
    }

    @And("user click on login button")
    public void clickLoginButton() {
        login.loginBtn.click();
    }

    @Then("user log in successfully") @And("user go to home page")
    public void loginSuccessfully() {
        Assert.assertTrue(login.logoutBtn.isDisplayed());
    }
}
