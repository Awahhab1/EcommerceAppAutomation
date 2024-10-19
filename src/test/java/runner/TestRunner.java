package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {

                "src/test/resources/features"
        },
        // Path to feature files
        glue = {"StepDefinition"},// Package containing step definitions


        plugin = {
                "pretty",

                "html:target/cucumber-reports.html", // HTML report output
                "json:target/cucumber-reports.json", // JSON report output
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
               // , "cucumber.plugin=io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"

        },
        monochrome = true                     // Makes console output more readable

)
public class TestRunner {



}
