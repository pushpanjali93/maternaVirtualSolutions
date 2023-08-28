package org.example.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//main//java//org//example//features",
        glue = {"org.example.stepDefinitions","org.example.pages"},
        monochrome = true,
        // tags= "@regression",
        plugin = {
                "pretty",
                "html:target/testReport"
        }
)
public class TestRunner {
}
