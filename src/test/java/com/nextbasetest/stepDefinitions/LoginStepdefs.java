package com.nextbasetest.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class LoginStepdefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("nextBaseUrl");
    }
    @When("user enters hr username")
    public void user_enters_hr_username() {

    }
    @When("user enters hr password")
    public void user_enters_hr_password() {

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }
}
