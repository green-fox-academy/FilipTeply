package com.greenfoxacademy.filip4.controllers;


import java.util.ArrayList;

public interface FileHandler {

    ArrayList<String> openTxtFileAndGetLinesAsArrayList(String filename);

    void saveIntoFile(String targetFileNameWithPath, ArrayList lines);


}
