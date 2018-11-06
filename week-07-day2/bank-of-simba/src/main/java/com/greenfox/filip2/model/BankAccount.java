package com.greenfox.filip2.model;

import java.math.BigDecimal;

public class BankAccount {

    String name;
    BigDecimal balance;
    String animalType;
    String currency;


    public BankAccount(String name, BigDecimal balance, String currency, String animalType) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
