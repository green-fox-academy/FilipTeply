package com.greenfox.filip.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Appenda {

    @JsonProperty("appended")
    String appendable;

    public Appenda(String appendable) {
        this.appendable = appendable + "a";
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
