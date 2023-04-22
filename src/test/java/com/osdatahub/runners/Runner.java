package com.osdatahub.runners;

import com.osdatahub.pageObjects.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.osdatahub.pageObjects.BaseClass.getAndSetVariables;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "com/osdatahub/stepdefs",
        dryRun = false

)
public class Runner extends BaseClass {

    @BeforeClass
    public static void setUp(){
        getAndSetVariables();
    }
}