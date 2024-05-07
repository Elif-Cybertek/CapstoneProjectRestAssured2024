import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAllUsers {
    @Test
    public void getAllUsers(){
        Response response = RestAssured.get("https://reqres.in/api/unknown").prettyPeek();

        // Verify status code is 200
        response.then().assertThat().statusCode(200);

        // Print the response body
        System.out.println("Response Body:");

        System.out.println(response.getBody().asString());

        // Send GET request and store the response
        Response response2 = RestAssured.given()

                .accept("application/json")

                .get("https://reqres.in/api/unknown")

                .prettyPeek();

        // Verify status code is 200
        response.then().assertThat().statusCode(200);

        // Verify content type is application/json
        response.then().assertThat().contentType("application/json");

        // Print the first user's name
        String firstName = response.jsonPath().getString("data[0].name");
        System.out.println("First User Name: " + firstName);


    }
    }

