package makeMyTrip;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources",
                 glue="makeMyTrip",
                 monochrome=true,
                 tags="@Run",
                 dryRun= false)

public class TestRunner {

}
