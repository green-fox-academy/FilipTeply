package com.greenfoxacademy.filip4.Models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> listOfFoxes;


    public FoxService() {
        this.listOfFoxes = new ArrayList<>();
    }

    public void addFox(Fox fox) {
        listOfFoxes.add(fox);
    }

    public List<Fox> getListOfFoxes() {
        return listOfFoxes;
    }

    public void updateListOfFoxes(List<Fox> listOfFoxes) {
        this.listOfFoxes = listOfFoxes;
    }

}