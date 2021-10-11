//import io.restassured.http.ContentType;
//import org.junit.Test;
//
//import static io.restassured.RestAssured.given;
//
//
//public class test1 {
//    @Test
//    public void  createTest() {
//        ParametersRequest rq = new ParametersRequest();
//
//        ParametersResponse rs = (ParametersResponse) given().
//                baseUri("https://processing-stage.psmock.com/mnogopay/s/purchase").
//                header("secret","QWERTY000097531KEY").
//                contentType(ContentType.JSON).
//                body(rq).
//                when().
//                post().
//                then().
//                extract().as(ParametersResponse.class);
//
//
//
//
//
//    }
//}
