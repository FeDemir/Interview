package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class CodilityStepDefinition {
    Response response;
    String uri;

    @Given("existing server application {string}")
    public void existing_server_application(String endURI) {
        uri = endURI;
    }

    @Then("GET request to {string} it return expected users list")
    public void get_request_to_it_return_expected_users_list(String endURI) {
        response = given().accept(ContentType.JSON).when().get(uri + endURI);
        response.then().statusCode(200);
        List<Map<String, Object>> users = response.jsonPath().getList("data");
        users.forEach(user -> System.out.println(user));
        Assert.assertTrue(users.size() > 0);
    }

    @Then("GET request to {string} it returns expected welcome message")
    public void get_request_to_it_returns_expected_welcome_message(String endURI) {
        response = given().accept(ContentType.JSON).when().get(uri + endURI);
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("data.id"), "2");
    }

    @Then("on GET request to {string} it returns {int} status code")
    public void on_get_request_to_it_returns_status_code(String string, int statusCode) {
        response = given().accept(ContentType.JSON).when().get(uri + string);
        Assert.assertEquals(response.statusCode(), statusCode);
    }

    @When("POST new registration {string} and {string} to {string}")
    public void postNewRegistrationAndTo(String email, String password, String endURI) {
        String body = "{\n" +
                "    \"email\": \"" + email + "\",\n" +
                "    \"password\": \"" + password + "\"\n" +
                "}";
        System.out.println("body = " + body);
        response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON).
                and().body(body)
                .and().header("Content-Type", "application/json")
                .when().post(uri + endURI);
    }

    @Then("endpoint returns expected {string} and {string} and {string}")
    public void endpointReturnsExpectedAndAnd(String status, String id, String token) {
        Assert.assertEquals(response.statusCode()+"", status);
        Assert.assertEquals(response.jsonPath().getString("id")+"", id);
        Assert.assertEquals(response.jsonPath().getString("token")+"", token);
    }



}
