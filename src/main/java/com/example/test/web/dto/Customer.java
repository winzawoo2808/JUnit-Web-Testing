package com.example.test.web.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;

//    protected Customer() {}
//
//    public Customer(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Customer[id=%d, Name='%s', Address='%s']",
//                id, name, address);
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
