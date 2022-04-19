package StepDefinitions;

import Pages.GoogleHomePage;
import Pages.GoogleResultPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GoogleSearch_StepDefinitions {
    WebDriver driver  = Driver.getDriver();
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("User goes to {string}")
    public void user_goes_to(String url) {
        driver.get(ConfigurationReader.getProperty(url));
    }
    @Then("User searches {string}")
    public void userSearches(String keyword) {
        googleHomePage.search(keyword);

    }

    @Then("User confirms count on founds is greater than {int}")
    public void user_confirms_count_on_founds_is_greater_than(int expectedResult) {
        GoogleResultPage resultPage = new GoogleResultPage();
        String text = resultPage.resultStats.getText();
        text = text.substring(text.indexOf(" ")+1);
        text = text.substring(0,text.indexOf(" "));
        Long actualResult = Long.parseLong(text.replaceAll("\\D",""));
        System.out.println("actualResult = " + actualResult);
        Assert.assertTrue(actualResult>expectedResult);
    }


}
