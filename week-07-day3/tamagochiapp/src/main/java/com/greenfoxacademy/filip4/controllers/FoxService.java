package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;

import java.util.List;

public interface FoxService {

    void saveFox(Fox fox);

    void addFox(Fox fox);

    List<Fox> getAllFoxes();

    Fox getFoxFromList(String name);





}