import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;


public class test1 {
    @Test
    public void  createTest() {
        ParametersResponse rs = new ParametersResponse();
        ParametersRequest rq = new ParametersRequest();
        rq.setAmount("3");
        rq.setCurrtncy("RUB");
        rq.setOrder_id("testorder222");
        rq.setPhone("76665554433");
        rq.setDescription("some description");

        rs = given().
                baseUri("https://processing-stage.psmock.com/mnogopay/s/purchase").
                header("secret","QWERTY000097531KEY").
                contentType(ContentType.JSON).
                body(rq).
                when().
                post().
                then().
                extract().as(ParametersResponse.class);







    }
}
