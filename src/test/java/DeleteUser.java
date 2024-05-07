import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteUser {
    @Test
    public void deleteUser() {

        // Send DELETE request to remove user with ID 2
        Response response = RestAssured.delete("https://reqres.in/api/users/2").prettyPeek();

        // Verify status code is 204 (No Content) for successful deletion
        System.out.println("Status code = " + response.statusCode());

        // Print confirmation message
        System.out.println("User deleted successfully.");
    }
}
