import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class APITest {
    @Test
   public void test(){
       Response response = RestAssured.get("https://reqres.in/api/users?page=2");

       //print response
        response.prettyPrint();

        //headers
        System.out.println("HEADERS :::" +response.getHeaders());

        //content-type
        System.out.println("CONTENT TYPE ::: "+response.getContentType());

        //status code
        System.out.println("STATUS CODE ::: "+response.statusCode());

        //date
        System.out.println("DATE :::"+response.header("Date"));

        //verify response has date
        System.out.println(response.headers().hasHeaderWithName("Date"));
        Assert.assertTrue(response.headers().hasHeaderWithName("Date"));





    }




    }

