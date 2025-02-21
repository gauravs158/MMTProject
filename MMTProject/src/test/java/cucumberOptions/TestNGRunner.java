package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\featureFiles", 
glue="stepDefinitionFiles", monochrome=true,
dryRun=false,
plugin = {
        "json:build/cucumber-reports/cucumber.json",
        "rerun:build/cucumber-reports/rerun.txt",
        "pretty:target/cucumber.html",
        "json:target/cucumber.json"
  })
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
