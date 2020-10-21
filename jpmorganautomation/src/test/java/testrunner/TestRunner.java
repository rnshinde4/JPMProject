package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utility.WebDriverReusable;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/HtmlReport" }, 
		features = "src/test/resources/features/ValGoogleSearch.feature", 
		glue = {"stepdefinitions" },
		monochrome = true,
		dryRun = false,
		tags = { "@googlesearch","@regression"})

public class TestRunner extends WebDriverReusable {
	@AfterClass
	public static void close() {
		driver.quit();
	}
}
