package com.greenfoxacademy.filip4.controllers;

import com.greenfoxacademy.filip4.Models.Fox;
import com.greenfoxacademy.filip4.Models.Trick;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService implements FileHandler {

    List<Fox> listOfFoxes;


//    listOfFoxes =Arrays.asList(new Fox("Mr Fox","pizza","lemonade"),
//            new Fox("Ms Foxess","cakes","coffee"));

    String filename = "C:\\Users\\TeplyF\\greenfox\\FilipTeply\\week-07-day3\\tamagochiapp\\src\\main\\resources\\static\\listOfFoxes.txt";

    Fox mrFox = new Fox("Mr Fox", "pizza", "lemonade");
    List<Trick> mrFoxTrickList = Arrays.asList(new Trick("HTML"), new Trick("Java"));

    Fox msFoxess = new Fox("Ms Foxess", "cakes", "coffee");



    //listOfFoxes.add(msFoxess);


    public FoxService() {
        this.listOfFoxes = new ArrayList<>();
    }

    public void addFox(Fox fox) {
        ArrayList<String> lines;
        lines = openTxtFileAndGetLinesAsArrayList(filename);
        lines.add(fox.toString());
        saveIntoFile(filename, lines);
    }

    public ArrayList<String> getListOfFoxes() {
        return openTxtFileAndGetLinesAsArrayList(filename);
    }

    public void updateListOfFoxes(ArrayList<Fox> listOfFoxes) {

        this.listOfFoxes = listOfFoxes;
    }


    @Override
    public ArrayList<String> openTxtFileAndGetLinesAsArrayList(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            Path myPath = Paths.get(filename);
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) lines;
    }

    @Override
    public void saveIntoFile(String targetFileNameWithPath, ArrayList lines) {
        try {
            Path myPath = Paths.get(targetFileNameWithPath);
            Files.write(myPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}