package io.api.desafio;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateUserTest {
    private ApiClient apiClient;
    private User user;

    @BeforeEach
    public void setUp() {
        apiClient = new ApiClient();
        user = new User();
        user.setName("John Doe");
        user.setJob("Software Engineer");
    }

    @Test
    public void testCreateUser() {
        Response response = apiClient.createUser(user);

        // Validar Status Code
        assertThat(response.getStatusCode(), equalTo(201));

        // Validar Campos obrigatórios
        assertThat(response.jsonPath().getString("name"), equalTo(user.getName()));
        assertThat(response.jsonPath().getString("job"), equalTo(user.getJob()));

        // Validar Contrato
        assertThat(response.jsonPath().getString("id"), notNullValue());
        assertThat(response.jsonPath().getString("createdAt"), notNullValue());
    }
}