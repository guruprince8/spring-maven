package com.ott.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ott.entity.Customer;

import java.util.List;

public class CustomerResponse {
    @JsonProperty(value = "customers")
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
