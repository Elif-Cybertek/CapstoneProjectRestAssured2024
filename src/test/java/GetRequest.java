import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class GetRequest {


    @Test
    public void getSingleUser(){

        Response response = RestAssured.get("https://reqres.in/api/users/2").prettyPeek();

        // Get values from the JSON response
        String email = response.path("data.email");
        String firstName = response.path("data.first_name");
        String lastName = response.path("data.last_name");
        int id = response.path("data.id");

        // Print the values
        System.out.println("Email: " + email);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Id : " + id);



        // Verify status code is 200
        Assert.assertEquals(200,response.statusCode());


    }



    }

