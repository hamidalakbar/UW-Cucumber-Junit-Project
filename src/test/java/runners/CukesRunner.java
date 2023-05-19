package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features", // feature files package
        glue = "step_definitions", // step definitions package
        plugin = {
                "html:target/cucumber-reports.html", // for HTML reports
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", // for Cucumber-Maven reports
                "rerun:target/rerun.txt" // to track failed scenarios for further execution
        },
        publish = true, // to generate public report with link in console
        dryRun = false, // to execute feature files and get code snippets
        tags = "@wip" // to create custom execution suite
)
public class CukesRunner {
}
