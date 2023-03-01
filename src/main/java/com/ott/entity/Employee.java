package com.ott.entity;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee() {

    }

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[id="+this.id+",name="+this.name+"]";
    }
}
