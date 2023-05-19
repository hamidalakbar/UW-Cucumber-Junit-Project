package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ResearchPage;

import static utilities.ConfigurationReader.*;

import static utilities.Driver.*;

public class Research_StepDefinitions {

    ResearchPage researchPage = new ResearchPage();

    @Given("user is on {string} web page")
    public void user_is_on_web_page(String webPage) {
        switch (webPage.toLowerCase()) {
            case "research administration learning":
            case "research":
                getDriver().get(getProperty("researchUrl"));
                break;
            default:
                throw new NoSuchWebPageException(webPage);
        }
    }

    @Then("user should be able to enter {string} into the {string}")
    public void user_should_be_able_to_enter_into_the(String expectedData, String field) {
        researchPage.searchForTraining.sendKeys(expectedData + Keys.ENTER);
        String actualData = researchPage.searchForTraining.getAttribute("value");
        Assert.assertEquals(expectedData, actualData);
    }

    @When("no search criteria is entered")
    public void no_search_criteria_is_entered() {
        researchPage.searchForTraining.clear();
    }
    @Then("user sees {int} records on the web page")
    public void user_sees_records_on_the_web_page(int expectedRecords) {
        Assert.assertEquals(expectedRecords, researchPage.records.size());
    }

}

class NoSuchWebPageException extends RuntimeException {
    NoSuchWebPageException(String page) {
        super(page);
    }
}