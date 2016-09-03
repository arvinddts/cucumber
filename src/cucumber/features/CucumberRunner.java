package cucumber.features;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features",format = {"pretty", "html:target/cucumber"},tags={"@ebay"})
public class CucumberRunner {

}
