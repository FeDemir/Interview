package Tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class RegResAPI {
     String baseURI = ConfigurationReader.getProperty("baseURI");

    @Test
    public void positiveLoginTest(){

        String request = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";
        System.out.println("baseURI = " + baseURI+"/login");
        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(request)
                .when().post(baseURI+"/login");

        JsonPath jsonPath = response.jsonPath();
        String token = jsonPath.getString("token");
        System.out.println("token = "+ token);
        assertTrue(token.length() > 0);
        assertEquals(200,response.statusCode());
    }

    @Test
    public void negativeLoginTest(){
        String request = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\"\n" +
                "}";

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(request)
                .when().post(baseURI+"/login");

        assertEquals(400,response.statusCode());
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        String error = jsonPath.getString("error");

        System.out.println("error "+ error);
        assertEquals("Missing password",error);
    }

    @Test
    public void getUsersTest(){

        Response response = given().accept(ContentType.JSON)
                .when().get(baseURI+"/users");

        assertEquals(200,response.statusCode());
        JsonPath jsonPath = response.jsonPath();

        List<Map<String,Object>> ids = jsonPath.getList("data");
        ids.forEach(System.out::println);

        assertTrue(ids.size() > 0);
    }

    @Test
    public void getWrongUserTest(){

        Response response = given().accept(ContentType.JSON)
                .when().get(baseURI+"/users/0");

        assertEquals(404,response.statusCode());
        assertEquals(response.asString(),"{}");
    }
    @Test
    public void getUserByIdTest(){

        Response response = given().accept(ContentType.JSON)
                .when().get(baseURI+"/users/2");

        assertEquals(200,response.statusCode());
        JsonPath jsonPath = response.jsonPath();

        Map<String,Object> user = jsonPath.getMap("data");
        System.out.println(user);
        assertEquals("Janet",user.get("first_name"));
    }

    @Test
    public void createUserTest(){

        String request = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(request)
                .when().post(baseURI+"/users");

        assertEquals(201,response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("id");
        System.out.println("id = "+id);
        assertTrue(id > 0);
    }

    @Test
    public void deleteUser(){
        Response response =   when().delete(baseURI+"/users/2");
        assertEquals(204,response.statusCode());


    }

    @Test
    public void name() {
        Select countries = new Select(Driver.getDriver().findElement(By.id("countries")));
        countries.getOptions().size();
        for (WebElement option : countries.getOptions()) {

                System.out.println(option.getText());
                option.click();

        }

    }
}
