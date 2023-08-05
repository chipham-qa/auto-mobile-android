package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        //tags = "@InvalidLogin"
        plugin = {"html:target/cucumber-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunnerLogin extends AbstractTestNGCucumberTests {
}
