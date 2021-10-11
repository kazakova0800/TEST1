
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class test2 {
    @Test
    public void  issueCreateTest() {
//        String issueJSON = "{" +
//                "\"amount\":\"333\"," +
//                "\"currency\":\"RUB\"," +
//                "\"order_id\":\"testorder222\"," +
//                "\"phone\":\"76665554433\"," +
//                "\"description\":\"some description\"" +
//                "}";
        given().
                baseUri("http://reqres.in/api").
                contentType(ContentType.JSON).
//                body(issueJSON).
                when().
                get().
                then().
                statusCode(200);


    }


}
