package com.example.test.web.services;

import com.example.test.web.dto.Customer;
import com.example.test.web.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

//    public void update(Long id){
//        Optional<Customer> customer = customerRepository.findById(id);
//
//        if (customer.isPresent()){
//
//        }
//    }

    public void delete(Long id){
        customerRepository.deleteById(id);
    }

    public Optional<Customer> findById(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        return customer;
    }
    public List<Customer> findByName(String name){
        List<Customer> customerList = customerRepository.findByName(name);
        return customerList;
    }

    public Iterable<Customer> findAll(){
        Iterable<Customer> customerList = customerRepository.findAll();
        return customerList;
    }
}
