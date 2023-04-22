package com.osdatahub.runners;

import org.example.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


//contains the main method that runs the Selenium tests.
//multiple test classes are usually created, and each test class contains multiple test methods.
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        tags = "@Smoke",
        glue = "com/osdatahub/stepdefs",
        dryRun = false
)
public class Runner extends BaseClass{

    // sets up and tears the test environment for the entire test suite
    @BeforeClass // runs once before all the tests in the class are executed
    public static void setUp(){
        getAndSetVariables();
    }

    @AfterClass // runs once after all the tests in the class are executed. In this case
    public static void after(){
        closeDriver();
    }
}

