package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"api/cucumber/features/steps", "Hooks"},
//        plugin = {"pretty", "json:target/report.json"}
//        plugin = {"pretty", "junit:target/report.xml"}
        plugin = {"pretty", "html:target/report.html"}
)
@RunWith(Cucumber.class)
public class Run extends AbstractTestNGCucumberTests {
}
