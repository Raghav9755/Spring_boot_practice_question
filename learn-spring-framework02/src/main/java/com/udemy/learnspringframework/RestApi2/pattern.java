package com.udemy.learnspringframework.RestApi2;

public class pattern {
    private String pattern1;

    public String getPattern1() {
        return pattern1;
    }

    public void setPattern1(String pattern1) {
        this.pattern1 = pattern1;
    }

    public pattern(String pattern1) {
        this.pattern1 = pattern1;
    }

    @Override
    public String toString() {
        return "pattern{" +
                "pattern1='" + pattern1 + '\'' +
                '}';
    }
}

