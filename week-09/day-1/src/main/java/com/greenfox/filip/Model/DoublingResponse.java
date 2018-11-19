package com.greenfox.filip.Model;

public class DoublingResponse {

    int received;
    int result;

    public DoublingResponse(int received) {
        this.received = received;
        result = 2 * received;
    }

//    public int doubling(int rece)

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
