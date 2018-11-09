package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;
import com.greenfoxacademy.filip4.Models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxListHandler implements FoxService {

    List<Fox> listOfFoxes;

    public FoxListHandler() {
        listOfFoxes = new ArrayList<>();
        Fox mrFox = new Fox("Mr Fox", "pizza", "lemonade");
        Fox mrsFoxess = new Fox("Mrs Foxess", "cakes", "coffee");
        Fox mrGreen = new Fox("Mr Green", "green apples", "coke");
        List<Trick> mrFoxTrickList = Arrays.asList(new Trick("HTML"), new Trick("Java"));
        List<Trick> mrsFoxessTrickList = Arrays.asList(new Trick("Basic"), new Trick("Java"));
        List<Trick> mrGreenTrickList = Arrays.asList(new Trick("Pascal"), new Trick("Java"));
        listOfFoxes.add(mrFox);
        listOfFoxes.add(mrsFoxess);
        listOfFoxes.add(mrGreen);
    }

    @Override
    public void addFox(Fox fox) {
        listOfFoxes.add(fox);
    }

    @Override
    public void saveFox(Fox fox) {
    }

    @Override
    public List<Fox> getAllFoxes() {
        return null;
    }

    @Override
    public Fox getFoxFromList(String name) {
        return listOfFoxes.stream()
                .filter(l -> l.getName().equals(name))
                .findFirst()
                .get();
    }
}

