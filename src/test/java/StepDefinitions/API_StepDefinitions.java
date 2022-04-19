package StepDefinitions;

import POJOs.Company;
import POJOs.Person;
import Utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.Map;

public class API_StepDefinitions {
    Response response;
    List<Map<String,Object>> responseListMap;
    @Given("User sends get request to {string} with end point {string}")
    public void user_sends_get_request_to_with_end_point(String endPoint, String path) {
        response = given().accept(ContentType.JSON)
                .when().get(ConfigurationReader.getProperty(endPoint)+"/"+path);

    }
    @Then("User confirms status code is {int}")
    public void user_confirms_status_code_is(Integer statusCode) {
        System.out.println("response = " + response.statusCode());
        response.then().assertThat().statusCode(statusCode);

    }
    @Then("User gets first user as person class")
    public void user_gets_first_user_as_person_class() {
        Person person = response.then().extract().as(Person.class);
        System.out.println("person = " + person);
    }
    @Then("User confirms data matches with data below")
    public void user_confirms_data_matches_with_data_below(Map<String,Object> userInfo) {
        System.out.println("userInfo = " + userInfo);
    }
    @Given("User sends get request to {string}")
    public void user_sends_get_request_to(String endPoint) {
        response = given().accept(ContentType.JSON)
                .when().get(ConfigurationReader.getProperty(endPoint));
        response.then().assertThat()
                .statusCode(200)
                .and().log().all();
    }
    @Then("User verifies that payload has {string}")
    public void user_verifies_that_payload_has(String message) {
        assertThat(String.valueOf(response.body().asString().contains(message)),true);
    }

    @Then("User gets all users as a list")
    public void userGetsAllUsersAsAList() {
        responseListMap = response.then().extract().body().as(List.class);
    }

    @And("User confirms list size bigger than {int}")
    public void userConfirmsListSizeBiggerThan(int size) {
        Assert.assertTrue(responseListMap.size()>size);
    }

}
