package com.osdatahub.stepdefs;

import com.osdatahub.implementation.GeneralImpl;
import org.example.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GeneralStepDefs extends BaseClass {
    GeneralImpl general = new GeneralImpl();

    //step definitions that match the Gherkin steps,
    //and executing the code associated with those steps
    @When("user open main page on browser")
    public void openMainPage() {
        getDriver().get(url);
        getDriver().manage().window().maximize();
        general.clickByName("acceptCookies");
    }

    @And("the user verifies {string} elements")
    public void verifyPage(String page) {
        general.verifyPage(page);
    }

    @When("the user verifies {string} on {string} page")
    public void navigateAndVerify(String menu, String page) {
        general.clickByName(page);
        general.verifyMenu(menu);
    }

    @Given("the user calls API {string} and verifies {string} as {string}")
    public void verifyResponse(String endpoint, String verify, String expectedResult) {
        general.verifyResponse(general.callAPI(endpoint), verify,expectedResult);
    }
}

