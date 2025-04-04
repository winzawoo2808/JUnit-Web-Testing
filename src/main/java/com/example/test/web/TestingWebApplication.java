package com.example.test.web;

import com.example.test.web.dto.Customer;
import com.example.test.web.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingWebApplication.class, args);
	}

//	private static final Logger log = LoggerFactory.getLogger(TestingWebApplication.class);
//
//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository){
//		return (args -> {
//
//			//save a few customers
//			repository.save(new Customer("Jack", "No.11, Downing Road, London"));
//			repository.save(new Customer("Chloe", "No.2, Real Estate Road, Rio, Brazil"));
//			repository.save(new Customer("Kim", "No.56, Tokyo, Japan"));
//			repository.save(new Customer("David", "No. 65, Panama, Panama"));
//			repository.save(new Customer("Michelle", "No.16, Pathein Road, Singapore"));
//
//			// fetch all customers
//			repository.findAll().forEach(customer -> {
//				log.info(customer.toString());
//			});
//
//			Customer customer = repository.findById(1L);
//			log.info(customer.toString());
//
//			repository.findByName("Jack").forEach(unkown -> {
//				log.info(unkown.toString());
//			});
//
//		});
//	}
}
