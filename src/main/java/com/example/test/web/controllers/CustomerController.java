package com.example.test.web.controllers;

import com.example.test.web.dto.Customer;
import com.example.test.web.services.CustomerService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("webtest/v1/customer")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @RequestMapping("/create")
    public ResponseEntity create(@RequestBody Customer customer){
        service.save(customer);
        return new ResponseEntity<>("Customer Creation Successful", HttpStatus.OK);
    }

    @RequestMapping("/delete/{id}")
    public ResponseEntity update(@PathVariable int id){
        service.delete(Long.valueOf(id));
        return new ResponseEntity<>("Deleting the customer is successful", HttpStatus.OK);
    }

    @RequestMapping("/get/{id}")
    public ResponseEntity  getCustomerById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(Long.valueOf(id)), HttpStatus.OK);
    }

    @RequestMapping("/getbyname/{name}")
    public ResponseEntity  getCustomerByName(@PathVariable String name){
        return new ResponseEntity<>(service.findByName(name), HttpStatus.OK);
    }
}
