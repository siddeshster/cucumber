package ccmbr;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        dryRun = false,
        strict = true,
        tags = {"@Regression"},
        monochrome = true
        )
public class RunCucumberTest {

}
