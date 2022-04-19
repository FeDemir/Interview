package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
    @Given("user navigates to website")
    public void user_navigates_to_website() {
        System.out.println("user navigates to website");
    }
    @When("I enter correct {string} and {string}")
    public void i_enter_correct_and(String username, String password) {
        System.out.println("I enter correct "+username+" and "+password);
    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        System.out.println("login should be successful");
    }


    @When("I enter correct {string}")
    public void iEnterCorrect(String username) {
        System.out.println("I enter correct "+username);
    }

    @When("I enter correct {string} and {string} with {int}")
    public void iEnterCorrectAndWith(String username, String password, int num) {
        System.out.println("I enter correct "+username+" and "+password+" with "+num);
    }
}
