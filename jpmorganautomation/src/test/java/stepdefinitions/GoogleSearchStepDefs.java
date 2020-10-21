package stepdefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;
import cucumber.api.java.en.*;
import pageobject.GooglePage;

public class GoogleSearchStepDefs {
	
GooglePage googlePg = new GooglePage();
Logger logger = Logger.getLogger("GoogleSearchStepDefs");

@Given("^user navigated to google webpage \"([^\"]*)\"$")
public void userNavigatedToGoogleWebpage(String pageTitle) throws Throwable {
	googlePg.launchUrl();
	String actPageTitle = googlePg.getPageTitle();
	Assert.assertTrue(actPageTitle.equals(pageTitle));
	logger.info("Successfully navigated to google page");
}

@When("^user search for \"([^\"]*)\" and click on relevant search result item$")
public void userSearchForAndClickOnRelevantSearchResultItem(String searchData) throws Throwable {
	googlePg.enterSearchData(searchData);
	googlePg.clickJPMLink();
	logger.info("Clicked on required search result");
}

@Then("^user should be able to view jpm logo on the page$")
public void userShouldBeAbleToViewJpmLogoOnThePage() throws Throwable {
	boolean isLogoPresent = googlePg.verifyJPMLogo();
	Assert.assertTrue(isLogoPresent);
	logger.info("JP Morgan logo is visible on page");
}

}
