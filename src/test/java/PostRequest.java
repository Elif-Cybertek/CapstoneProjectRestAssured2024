import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostRequest {

    @Test
    public void postRequest() {



        // Request body for creating a new user
        String requestBody = "{ \"name\": \"John\", \"job\": \"Software Engineer\" }";

        // Send POST request to create a new user and store the response
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .post("https://reqres.in/api/users")
                .prettyPeek();

        // Verify status code is 201 (created)
        response.then().assertThat().statusCode(201);

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }
    }
