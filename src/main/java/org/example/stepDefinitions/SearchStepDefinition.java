package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.commonFunctions.CommonFunctions;
import org.example.pages.SearchPage;

public class SearchStepDefinition {
    @Given("Navigate to the page")
    public void navigateToPage() {
        CommonFunctions.navigateToPage();
    }

    @When("Handle the page cookies")
    public void handleCookies() {
        SearchPage.deleteCookies();
    }

    @Then("Search on the page {string}")
    public void searchOnThePage(String keyword) {
        SearchPage.search(keyword);
    }

    @Then("Verify the page using title")
    public void VerifyPage() {
        SearchPage.verifyPageTitle();
    }

    @Then("Click on the {int} link")
    public void clickOnPositionedLink(Integer position) {
        SearchPage.clickOnSearchResults(position);
    }
}
