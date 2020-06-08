package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepsDef {
    @Given("user in the login page")
    public void user_in_the_login_page() {
        String page = ConfigurationReader.get("url");
        Driver.get().get(page);
    }

    @When("user enter valid credentials {string} {string}")
    public void user_enter_valid_credentials(String string, String string2) {

        String user = ConfigurationReader.get("username");
        String pass = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(user, pass);
    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        BrowserUtils.waitFor(3);
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = Driver.get().getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue("Verify that Account Summary Page is Displayed",actualTitle.contains(expectedTitle));

    }
    @Then("Error message {string} should be displayed.")
    public void error_message_should_be_displayed(String string) {
        System.out.println("Login and/or password are wrong");
    }

}
