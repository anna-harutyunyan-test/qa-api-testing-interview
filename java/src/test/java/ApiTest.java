import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    public void testGetUsersShouldReturn200() {
        given()
            .baseUri(BASE_URL)
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0))
            .body("[0].name", notNullValue())
            .body("[0].email", notNullValue());
    }

    @Test
    public void testCreateUserShouldReturn201() {
        // TODO: Candidate Assignment
        // Write a test to POST a new user to /users.
        // Verify response is 201 Created and response mirrors body fields.
    }

    @Test
    public void testGetNonExistentUserShouldReturn404() {
        // TODO: Candidate Assignment
        // Write a negative test requesting /users/9999.
        // Verify code returns 404 Not Found.
    }
}
