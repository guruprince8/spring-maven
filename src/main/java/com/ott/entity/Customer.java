package com.ott.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer extends Person {
    @Id
    @JsonProperty(value = "customerId")
    @Column(name = "customer_id")
    private String customerId;
    @JsonProperty(value = "firstName")
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    @JsonProperty(value = "lastName")
    private String last_name;
    @JsonProperty(value = "customerSince")
    @Column(name = "customer_since")
    private Date customerSince;
    @Column(name = "customer_type")
    @JsonProperty(value = "customerType")
    private String customerType;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
