package com.greenfoxacademy.filip3;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is green in color...");
    }

}
