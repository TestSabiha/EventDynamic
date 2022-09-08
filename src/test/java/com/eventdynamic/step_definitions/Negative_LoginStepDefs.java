package com.eventdynamic.step_definitions;

import com.eventdynamic.pages.LoginPage;
import com.eventdynamic.utilities.BrowserUtils;
import com.eventdynamic.utilities.ConfigurationReader;
import com.eventdynamic.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Negative_LoginStepDefs {
    LoginPage loginPage;

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user click AppLogin button")
    public void user_click_app_login_button() {
        loginPage = new LoginPage();
        BrowserUtils.waitFor(3);
        loginPage.appLoginButton.click();
    }

    @When("user click log in button")
    public void user_click_log_in_button() {
        loginPage.log_inButton.click();

    }

    @When("user enter  Email {string}")
    public void user_enter_email(String string) {
        BrowserUtils.waitFor(3);
       // System.out.println("Driver.getDriver().getWindowHandles() = " + Driver.getDriver().getWindowHandles());
        BrowserUtils.switchToWindow("Log in | Event Dynamic");
        BrowserUtils.waitFor(2);
        loginPage.emailAdress.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @When("user enter Password {string}")
    public void user_enter_password(String string) {
        BrowserUtils.waitFor(3);
        loginPage.passwordBox.click();
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click Continue button")
    public void user_click_continue_button() {
        BrowserUtils.waitFor(3);
        loginPage.continueButton.click();

    }

    @Then("user verify the error message")
    public void user_verify_the_error_message() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(loginPage.warningMessage.isDisplayed());
        BrowserUtils.waitFor(3);
    }
}
