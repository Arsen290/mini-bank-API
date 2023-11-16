package cz.zentity.demo.service;

import cz.zentity.demo.DTO.CustomerDTO;
import cz.zentity.demo.entity.Customer;
import cz.zentity.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public synchronized Customer createCustomer(CustomerDTO customerDTO) {
        Customer customer = mapToCustomerEntity(customerDTO);
        return customerRepository.save(customer);
    }

    public synchronized void removeCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    public synchronized Customer modifyCustomer(Long customerId, CustomerDTO customerDTO) {
        Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setName(customerDTO.getName());
            existingCustomer.setSurname(customerDTO.getSurname());
            existingCustomer.setSex(customerDTO.getSex());
            existingCustomer.setNationality(customerDTO.getNationality());
            existingCustomer.setDateOfBirth(customerDTO.getDateOfBirth());
            existingCustomer.setCardNumber(customerDTO.getCardNumber());
            existingCustomer.setCardDateOfIssue(customerDTO.getCardDateOfIssue());
            existingCustomer.setCardDateOfExpiry(customerDTO.getCardDateOfExpiry());

            return customerRepository.save(existingCustomer);
        }
        return null;
    }

    private synchronized Customer mapToCustomerEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setSurname(customerDTO.getSurname());
        customer.setSex(customerDTO.getSex());
        customer.setNationality(customerDTO.getNationality());
        customer.setDateOfBirth(customerDTO.getDateOfBirth());
        customer.setCardNumber(customerDTO.getCardNumber());
        customer.setCardDateOfIssue(customerDTO.getCardDateOfIssue());
        customer.setCardDateOfExpiry(customerDTO.getCardDateOfExpiry());

        return customer;
    }
}
