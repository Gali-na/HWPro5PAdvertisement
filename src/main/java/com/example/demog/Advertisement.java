package com.example.demog;

public class Advertisement {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String pasword;
    private String textAdvertisement;

    public Advertisement(String name, String lastName, String phoneNumber, String pasword, String textAdvertisement) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pasword = pasword;
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

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
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
                ", pasword='" + pasword + '\'' +
                ", textAdvertisement='" + textAdvertisement + '\'' +
                '}';
    }
}
