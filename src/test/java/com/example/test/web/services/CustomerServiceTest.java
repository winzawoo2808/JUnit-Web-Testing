package com.example.test.web.services;

import com.example.test.web.dto.Customer;
import com.example.test.web.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class CustomerServiceTest {

    @InjectMocks
    private CustomerService service;

    @Mock
    private CustomerRepository repository;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void should_return_same_customer_when_save(){

        //Given
        Customer customer = new Customer();
        customer.setName("win zaw oo");
        customer.setAddress("No.1, River Vally Road, Yangon");

        Customer saveCustomer = new Customer();
        saveCustomer.setId(1);
        saveCustomer.setName("win zaw oo");
        saveCustomer.setAddress("No.1, River Vally Road, Yangon");

        //mock
        when(service.save(customer)).thenReturn(saveCustomer);

        //when
        //Customer customerResponse = service.save(customer);

        //then
        assertEquals(customer.getName(), saveCustomer.getName());
        assertEquals(customer.getAddress(), saveCustomer.getAddress());
        assertNotNull(saveCustomer.getId());
    }

}