package pages;

import br.com.getnet.homologacao.util.Root;
import factory.NewUserFactory;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import pojo.NewUser;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Users_POST extends Root {

    public void testNewUser() throws IOException {
        ValidatableResponse response = null;
        NewUser newUser = new NewUserFactory().newUser;
        try {
            response = given()
                    .contentType(ContentType.JSON)
                    .body(newUser)
                    .post("/users")
                    .then().assertThat().statusCode(201);

            logPass("Passou! status code recebido é " + response.extract().statusCode() + "!");
            logPassJson(response.extract().body().asString());
            response.body(matchesJsonSchemaInClasspath("./schemas/newUser.json"));

        }catch (AssertionError a){
            if (a.getMessage().contains("Response body doesn't match expectation.")) {
                logAssertFail("Falhou teste schema");
            } else {
                logAssertFail("Falhou! status code esperado é 201 as recebido " + response.extract().statusCode() + " !");
            }
        }
    }

}
