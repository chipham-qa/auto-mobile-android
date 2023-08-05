package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions"
        //tags = "@InvalidLogin"
)
public class TestRunnerLogin extends AbstractTestNGCucumberTests {
}
