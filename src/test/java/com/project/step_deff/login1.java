package com.project.step_deff;

import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Test;

public class login1 {

    @And("the user {string} login with password {string}")
    public void theUserLoginWithPassword(String arg0, String arg1) {
        Driver.getDriver().get("https://www.google.com/");

    }

    @Given("the user is {string}")
    public void theUserIs(String arg0) {

    }
}
