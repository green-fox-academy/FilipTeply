package com.greenfox.filip2.controller;

import com.greenfox.filip2.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

import java.util.Arrays;
import java.util.List;


@Controller
public class MultipleAccounts {

    @RequestMapping(value = "/show3")
    public String show(Model model) {

        List<BankAccount> bankAccountList = Arrays.asList(
                new BankAccount("Simba", new BigDecimal(2000.00), "Zebra", "lion", true),
                new BankAccount("Scar", new BigDecimal(80.00), "Zebra", "lion", false),
                new BankAccount("Nala", new BigDecimal(10.00), "Zebra", "lion", true),
                new BankAccount("Shenzi", new BigDecimal(30.00), "Zebra", "hog", false),
                new BankAccount("King", new BigDecimal(10000.00), "Zebra", "lion", true));

        model.addAttribute("accountList", bankAccountList);

        return "index3";
    }


//    @PutMapping
//    public BigDecimal increaseBalance() {
//        if () {
//
//        } else {
//        }
//    }


}