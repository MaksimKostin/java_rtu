package com.spring.practice_14;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bank implements AllFunc{
    @JsonProperty("name")
    public String  name;
    @JsonProperty("address")
    public String address;

    public Bank() { }

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
