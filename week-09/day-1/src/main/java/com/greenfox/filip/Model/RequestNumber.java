package com.greenfox.filip.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class RequestNumber {

    Integer until;

    public RequestNumber(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
