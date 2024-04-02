package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MobileBankApiTestV1 {

    @Test
    void shouldReturnSendData() {
        var text = "asd";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(202)
                .body("data", equalTo(text));
    }
}