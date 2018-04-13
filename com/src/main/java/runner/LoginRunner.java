package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/login.feature"}, glue={"pageclass", "stepclass"}
,tags = {"@tag1"},
format = {"pretty", "html:test-output"}
)

public class LoginRunner {

}
