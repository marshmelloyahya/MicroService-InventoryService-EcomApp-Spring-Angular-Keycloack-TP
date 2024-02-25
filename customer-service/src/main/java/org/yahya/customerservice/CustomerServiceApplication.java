package org.yahya.customerservice;

import org.yahya.customerservice.entities.Customer;
import org.yahya.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class customerserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(customerserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Yahya","yahya@gmail.com"));
            customerRepository.save(new Customer(null,"Ahmed","ahmed@gmail.com"));
        };
    }
}
