package com.osdatahub.stepdefs;

import com.osdatahub.implementation.GeneralImpl;
import com.osdatahub.pageObjects.BaseClass;
import com.osdatahub.pageObjects.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class GeneralStepDefs extends BaseClass {
    MainPage mainPage =new MainPage();
    GeneralImpl general = new GeneralImpl();

    @When("user open main page on browser")
    public void openMainPage() {
        getDriver().get(url);
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
}
