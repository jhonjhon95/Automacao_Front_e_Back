package io.api.desafio;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {
    private final String baseUri = "https://reqres.in/api/";

    public Response createUser(User user) {
        return RestAssured
                .given()
                .baseUri(baseUri)
                .header("Content-Type", "application/json")
                .body(user)
                .when()
                .post("users");
    }
}
