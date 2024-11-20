package com.example.demo12.Repository;

import com.example.demo12.entity.Customer;
import com.example.demo12.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer); // Guarda un nuevo cliente
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll(); // Devuelve todos los clientes
    }
}

