package com.example.demo12.Repository;

import com.example.demo12.models.Customer;
import com.example.demo12.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/customers")
    public class CustomerController {

        @Autowired
        private CustomerRepository  customerRepository;


        @PostMapping
        public Customer createCustomer(@RequestBody Customer customer) {
            return getCustomerRepository().save(customer);
        }


        @GetMapping
        public List<Customer> getAllCustomers() {
            return getCustomerRepository().findAll();
        }

        public CustomerRepository getCustomerRepository() {
            return customerRepository;
        }

        public void setCustomerRepository(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }
    }
}


