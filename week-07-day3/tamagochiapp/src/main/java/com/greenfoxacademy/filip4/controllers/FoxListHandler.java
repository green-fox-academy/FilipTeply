package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxListHandler implements FoxService {

    List<Fox> listOfFoxes;

    public FoxListHandler() {
        listOfFoxes = new ArrayList<>();
        Fox mrFox = new Fox("Mr Fox", "pizza", "lemonade");
        Fox msFoxess = new Fox("Ms Foxess", "cakes", "coffee");
        Fox mrGreen = new Fox("Mr Green", "green apples", "coke");
        listOfFoxes.add(mrFox);
        listOfFoxes.add(msFoxess);
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
}

//List<Trick> mrFoxTrickList = Arrays.asList(new Trick("HTML"), new Trick("Java"));

//List<Trick> msFoxessTrickList = Arrays.asList(new Trick("Basic"), new Trick("Java"));

//List<Trick> msFoxessTrickList = Arrays.asList(new Trick("Basic"), new Trick("Java"));