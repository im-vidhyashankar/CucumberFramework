package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

		/*		
		 * tags --> @all @smoke @regression
		 * Pretty ----> 1. Using pretty in Cucumber options of Runner class - Example: plugin={"pretty"} also,
						Prints the Gherkin source with additional colors and stack traces for errors in the Eclipse Output console
		 */

@CucumberOptions(
		features="src/test/resource/features",
		glue={"stepdefinitions","hooks"},
		tags="@all",
		// publish=true, ---> Publish reports on cloud
		//dryRun=false,
		plugin= {"pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"
				}
		)
//     Real projects:             '  and not @dev and not @wip and not @ignore ' 


public class TestRunner extends AbstractTestNGCucumberTests {
	
}
