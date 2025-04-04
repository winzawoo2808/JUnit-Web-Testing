package com.example.test.web.controllers;

import com.example.test.web.dto.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    void setup(){
        System.out.println("Before executing the test case");
    }

    @AfterEach
    void close(){
        System.out.println("After executing the test case");
    }

    @Test
    void get_customer_with_id_successfully(){
        assertThat(this.template.getForEntity(
                "http://localhost:" + port + "/webtest/v1/customer/get/56", Customer.class))
                .isNotNull();
        System.out.println("executed the get_customer_with_id_successfully");
    }


    @Test
    void get_customer_with_wrong_id_failed(){
        assertThat(this.template.getForEntity(
                "http://localhost:" + port + "/webtest/v1/customer/get/6", Customer.class))
                .isNotNull();

        System.out.println("executed the get_customer_with_wrong_id");
    }

    @Test
    void get_customer_with_name_successfully(){
        assertThat(this.template.getForEntity(
                "http://localhost:" + port + "/webtest/v1/customer/getbyname/Jack", List.class))
                .isNotNull();

        System.out.println("executed the get_customer_with_name_successfully");
    }

}