package com.example.demog;

import java.io.Serializable;

public class Advertisement implements Serializable {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String textAdvertisement;

    public Advertisement (String name, String lastName, String phoneNumber, String password, String textAdvertisement) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.textAdvertisement = textAdvertisement;
    }

    public Advertisement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password =password;
    }

    public String getTextAdvertisement() {
        return textAdvertisement;
    }

    public void setTextAdvertisement(String textAdvertisement) {
        this.textAdvertisement = textAdvertisement;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pasword='" + password + '\'' +
                ", textAdvertisement='" + textAdvertisement + '\'' +
                '}';
    }
}
