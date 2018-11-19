package com.greenfox.filip.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DoUntil {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    Integer result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String error;

    public DoUntil(String action, RequestNumber until) {

        if (until == null) {
            error = "Please provide a number!";

        } else if (action.equals("sum")) {

            for (int i = 0; i <= RequestNumber.until; i++) {
                result += i;
            }

        } else if (action.equals("factor")) {
            for (int i = 1; i <= RequestNumber.until; i++) {
                result=1;
                result = i * result;
            }
        }

    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}




