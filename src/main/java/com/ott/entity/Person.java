package com.ott.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class Person {

    @JsonProperty(value = "firstName")
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    @JsonProperty(value = "lastName")
    private String last_name;

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
}
