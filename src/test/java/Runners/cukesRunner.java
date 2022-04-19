package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/Features/",
        glue = "/",
        dryRun = true,
        tags = "@api",
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "html:target/cucumber-report.html",
                  "rerun:target/rerun.txt",//this will store failed scenarios into rerun.txt file
                  "json:target/cucumber.json"}
)
public class cukesRunner {
}
