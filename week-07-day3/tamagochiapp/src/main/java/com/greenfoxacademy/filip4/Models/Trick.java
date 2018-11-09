package com.greenfoxacademy.filip4.Models;

public class Trick {

    String trickName;

    public Trick() {
    }

    public Trick(String trickName) {
        this.trickName = trickName;
    }

    public String getTrick() {
        return trickName;
    }

    public void setTrick(String trick) {
        this.trickName = trick;
    }

    @Override
    public String toString() {
        return trickName;
    }
}
