package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/Feature",
glue= {"StepDefination","Hook"},
dryRun =false,
//monochrome = true,
//tags={"@scenario_five"},

plugin = { "pretty" ,"junit:target/report.xml","html:target/cucumber-pretty","json:target/jsonreport.json"}

)

public class testrunner {

}
