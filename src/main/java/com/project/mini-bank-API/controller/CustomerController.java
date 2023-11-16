package cz.zentity.demo.controller;

import cz.zentity.demo.DTO.CustomerDTO;
import cz.zentity.demo.entity.Customer;
import cz.zentity.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.createCustomer(customerDTO);
    }

    @DeleteMapping("/{customerId}")
    public void removeCustomer(@PathVariable Long customerId) {
        customerService.removeCustomer(customerId);
    }

    @PutMapping("/{customerId}")
    public Customer modifyCustomer(@PathVariable Long customerId, @RequestBody CustomerDTO customerDTO) {
        return customerService.modifyCustomer(customerId, customerDTO);
    }
}
