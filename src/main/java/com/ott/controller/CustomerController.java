package com.ott.controller;

import com.ott.dto.CustomerResponse;
import com.ott.entity.Customer;
import com.ott.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer-management/v1")
public class CustomerController {

    @Autowired
    public CustomerRepository customerRepository;
    @PostMapping("/search/customers")
    public ResponseEntity<CustomerResponse> searchCustomers(@RequestBody Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setCustomers(customerRepository.findAll());
        return  new ResponseEntity<>(customerResponse, HttpStatus.OK);
    }
}
