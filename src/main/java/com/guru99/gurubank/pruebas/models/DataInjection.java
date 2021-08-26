package com.guru99.gurubank.pruebas.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

String customerName;
String dateOfBirth;
String address;
String city;
String state;
String pin;
String mobileNumber;
String email;
String password;
String customerId;
String initialDeposit;
String userID;
String passwordUser;
String registeredSuccessfullyText;
String accountGeneratedSuccessfullyText;


    public DataInjection() {

        this.customerName = "Juan Benito";
        this.dateOfBirth = "02021997";
        this.address = "CL 42  85 A 96";
        this.city = "Medellin";
        this.state = "Medellin";
        this.pin = "973005";
        this.mobileNumber = "3103875534";
        this.email = faker.internet().emailAddress();
        this.password = "Frsita2021";
        this.customerId = customerId;
        this.initialDeposit = "300000";
        this.userID = "mngr349474";
        this.passwordUser = "utuvYtY";
        this.registeredSuccessfullyText = "Customer Registered Successfully!!!";
        accountGeneratedSuccessfullyText= "Account Generated Successfully!!!";

    }

    public String getAccountGeneratedSuccessfullyText() {
        return accountGeneratedSuccessfullyText;
    }

    public String getRegisteredSuccessfullyText() {
        return registeredSuccessfullyText;
    }

    public String getUserID() {
        return userID;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getInitialDeposit() {
        return initialDeposit;
    }
}
