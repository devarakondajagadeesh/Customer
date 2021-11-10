package com.example.Customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private int pincode;

    public Address(int id, String line1, String line2, String city, String state, int pincode) {
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPincode() {
        return pincode;
    }
}
