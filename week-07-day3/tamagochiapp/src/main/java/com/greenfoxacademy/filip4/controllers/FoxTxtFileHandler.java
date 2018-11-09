package com.greenfoxacademy.filip4.controllers;


import com.greenfoxacademy.filip4.Models.Fox;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxTxtFileHandler implements FoxService {

    static String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-07-day3\\tamagochiapp\\src\\main\\resources\\static\\listOfFoxes.txt";

    Fox mrFox;
    Fox msFoxess;
    List<Fox> listOfFoxes;

    public FoxTxtFileHandler() {
        Fox mrFox = new Fox("Mr_Fox", "pizza", "lemonade");
        //List<Trick> mrFoxTrickList = Arrays.asList(new Trick("HTML"), new Trick("Java"));

        Fox msFoxess = new Fox("Ms_Foxess", "cakes", "coffee");
        //List<Trick> msFoxessTrickList = Arrays.asList(new Trick("Basic"), new Trick("Java"));
        listOfFoxes = new ArrayList<>();

        listOfFoxes.add(msFoxess);
        listOfFoxes.add(mrFox);
    }

    public void addFox(Fox fox) {
        fox = new Fox();
        saveFox(fox);
    }

    public List<Fox> getListOfFoxes() {
        return listOfFoxes;
    }

    public void setListOfFoxes(List<Fox> listOfFoxes) {
        this.listOfFoxes = listOfFoxes;
    }

    public void updateListOfFoxes(ArrayList<Fox> listOfFoxes) {
        this.listOfFoxes = listOfFoxes;
    }


//    @Override
//    public ArrayList<String> openTxtFileAndGetLinesAsArrayList(String filename) {
//        List<String> lines = new ArrayList<>();
//        try {
//            Path myPath = Paths.get(filename);
//            lines = Files.readAllLines(myPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return (ArrayList<String>) lines;
//    }

    public void saveFile(String targetFileNameWithPath, ArrayList lines) {

    }

    @Override
    public void saveFox(Fox fox) {
        try {
            Path myPath = Paths.get(filename);
            Files.write(myPath, listOfFoxes.stream()
                    .map(f -> f.toString())
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Fox> getAllFoxes() {
        ArrayList<String> lines = null;
        try {
            Path myPath = Paths.get(filename);
            lines = (ArrayList<String>) Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.stream()
                .map(line -> new Fox(line))
                .collect(Collectors.toList());

    }

    @Override
    public Fox getFoxFromList(String name) {
        return null;
    }

//    @Override
//    public String getFoxName() {
//
//        getAllFoxes().stream()
//                .
//
//        return ;
//    }


}
