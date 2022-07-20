package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

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

    @When("I enter correct {string} and {string} with {string}")
    public void iEnterCorrectAndWith(String firstname, String lastname, String age) {
        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);
        System.out.println("age = " + age);
        System.out.println("I enter correct "+firstname+" and "+lastname+" with "+age);
        System.out.println();
    }

    @Then("user info should be printed")
    public void userInfoShouldBePrinted() {
        System.out.println("user info should be printed");
    }

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println( "User is on Home Page");
    }
    @When("User Navigate to LogIn Page")
    public void user_navigate_to_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Navigate to LogIn Page");
    }
    @When("User enters Credentials to LogIn")
    public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) {
        for (Map<Object,Object> data : dataTable.asMaps(String.class, String.class)) {
            System.out.println("data.get(\"username\") = " + data.get("username"));
            System.out.println("data.get(\"password\") = " + data.get("password"));
            System.out.println();
        }
    }
    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        System.out.println("Message displayed Login Successfully");
    }
}
