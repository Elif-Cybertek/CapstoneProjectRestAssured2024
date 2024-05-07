import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PutRequest {
    @Test
    public void updateUser() {

        // Request body for updating an existing user
        String requestBody = "{ \"name\": \"ipek\", \"job\": \"Senior Software Engineer in Test\" }";

        // Send PUT request to update an existing user and store the response
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .put("https://reqres.in/api/users/2") // Assuming you want to update user with ID 2
                .prettyPeek();

        // Verify status code is 200 (OK)
        response.then().assertThat().statusCode(200);

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }

}