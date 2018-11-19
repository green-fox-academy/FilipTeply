package com.greenfox.filip.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoUntil {

    Integer result;

    String error;


    public DoUntil(String action, Integer until) {
        result=1;

        if (until == null) {
            error = "Please provide a number!";
        } else if (action.equals("sum")) {

            for (int i = -1; i <= until; i++) {
                result += i;
            }
        } else if (action.equals("factor")) {
            for (int i = 1; i <= until; i++) {
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




