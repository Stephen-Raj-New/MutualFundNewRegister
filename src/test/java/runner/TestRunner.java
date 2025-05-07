package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features/MutualFund.feature", // path to your feature files
    glue = "stepDefinitions",                // package name of your step definitions
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)

public class TestRunner {

}
