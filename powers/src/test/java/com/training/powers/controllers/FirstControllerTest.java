package com.training.powers.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FirstControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void calls_greeting_endpoint_and_gets_the_greeting() {
        ResponseEntity<String> actualResponse = testRestTemplate.getForEntity("/greeting", String.class);
        assertThat(actualResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(actualResponse.getBody()).isEqualTo("Hello, world!");
    }

}
