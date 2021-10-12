import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;


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
                basePath("/users").
                contentType(io.restassured.http.ContentType.JSON).
                when().
                get().
                then().
                statusCode(200);


    }


}
