package com.lzp.test1.pojo;

public class Message {
    private String error;
    private String errText;

    public Message() {
    }

    public Message(String error, String errText) {
        this.error = error;
        this.errText = errText;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrText() {
        return errText;
    }

    public void setErrText(String errText) {
        this.errText = errText;
    }
}
